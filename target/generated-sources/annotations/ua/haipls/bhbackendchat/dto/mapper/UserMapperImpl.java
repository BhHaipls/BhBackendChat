package ua.haipls.bhbackendchat.dto.mapper;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Role;
import ua.haipls.bhbackendchat.domain.User;
import ua.haipls.bhbackendchat.dto.UserDto;
import ua.haipls.bhbackendchat.dto.UserDto.UserDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:32+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setNick( dto.getNick() );
        user.setStatus( dto.getStatus() );
        Set<Role> set = dto.getRoles();
        if ( set != null ) {
            user.setRoles( new HashSet<Role>( set ) );
        }

        return user;
    }

    @Override
    public UserDto toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDtoBuilder<?, ?> userDto = UserDto.builder();

        userDto.id( entity.getId() );
        userDto.firstName( entity.getFirstName() );
        userDto.lastName( entity.getLastName() );
        userDto.email( entity.getEmail() );
        userDto.nick( entity.getNick() );
        userDto.status( entity.getStatus() );
        Set<Role> set = entity.getRoles();
        if ( set != null ) {
            userDto.roles( new HashSet<Role>( set ) );
        }

        return userDto.build();
    }
}
