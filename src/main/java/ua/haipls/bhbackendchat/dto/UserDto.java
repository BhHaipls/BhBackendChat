package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.haipls.bhbackendchat.domain.Enum.Status;
import ua.haipls.bhbackendchat.domain.Role;

import java.util.Set;

@Data
@SuperBuilder
public class UserDto extends AbstractDto {

    private String firstName;

    private String lastName;

    private String email;

    private String nick;

    private Status status;

    private Set<Role> roles;
}
