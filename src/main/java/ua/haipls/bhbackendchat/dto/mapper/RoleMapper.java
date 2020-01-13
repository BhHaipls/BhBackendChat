package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Role;
import ua.haipls.bhbackendchat.dto.RoleDto;

@Mapper(componentModel = "spring")
public interface RoleMapper extends AbstractMapper<Role, RoleDto>{
}
