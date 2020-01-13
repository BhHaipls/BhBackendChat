package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.User;
import ua.haipls.bhbackendchat.dto.UserDto;


@Mapper
public interface UserMapper {
    User toEntity(UserDto dto);

    UserDto toDto(User entity);
}
