package ua.haipls.bhbackendchat.domain;

import lombok.Data;
import ua.haipls.bhbackendchat.domain.Enum.Status;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class User extends AbstractEntity {
    @Column(name = "first_name",length = 32, nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 32, nullable = false)
    private String lastName;

    @Column(name = "email", length = 64, nullable = false)
    private String email;

    @Column(name = "nick", unique = true,length = 24, nullable = false)
    private String nick;

    @Column(name = "password",length = 32, nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles;

}