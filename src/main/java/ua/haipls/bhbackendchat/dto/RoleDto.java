package ua.haipls.bhbackendchat.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto extends BaseDto {
    private String name;
}
