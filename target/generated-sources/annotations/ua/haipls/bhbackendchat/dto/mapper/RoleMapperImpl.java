package ua.haipls.bhbackendchat.dto.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Role;
import ua.haipls.bhbackendchat.dto.RoleDto;
import ua.haipls.bhbackendchat.dto.RoleDto.RoleDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:33+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role toEntity(RoleDto dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( dto.getId() );
        role.setName( dto.getName() );

        return role;
    }

    @Override
    public RoleDto toDto(Role entity) {
        if ( entity == null ) {
            return null;
        }

        RoleDtoBuilder<?, ?> roleDto = RoleDto.builder();

        roleDto.id( entity.getId() );
        roleDto.name( entity.getName() );

        return roleDto.build();
    }
}
