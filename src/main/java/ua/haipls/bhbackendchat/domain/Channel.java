package ua.haipls.bhbackendchat.domain;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
public class Channel extends BaseEntity {

    @Column(name = "name",length = 64)
    @NotBlank
    private String name;

    @ManyToMany
    @JoinTable(name = "user_channel",
            joinColumns = {@JoinColumn(name = "channel_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
    private List<User> userList;

    @ManyToOne
    private User author;
    @OneToMany
    private List<Message> messageList;

}