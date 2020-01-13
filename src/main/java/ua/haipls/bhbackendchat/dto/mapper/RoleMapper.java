package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Role;
import ua.haipls.bhbackendchat.dto.RoleDto;

@Mapper
public interface RoleMapper {
    Role toEntity(RoleDto dto);

    RoleDto toDto(Role entity);
}
