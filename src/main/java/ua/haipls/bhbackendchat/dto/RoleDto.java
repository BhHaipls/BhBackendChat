package ua.haipls.bhbackendchat.dto;


import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class RoleDto extends AbstractDto {
    private String name;
}
