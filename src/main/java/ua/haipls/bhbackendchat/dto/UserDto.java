package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import ua.haipls.bhbackendchat.domain.Enum.Status;
import ua.haipls.bhbackendchat.domain.Role;

import java.util.Set;

@Data
@Builder
public class UserDto extends BaseDto {

    private String firstName;

    private String lastName;

    private String email;

    private String nick;

    private Status status;

    private Set<Role> roles;
}
