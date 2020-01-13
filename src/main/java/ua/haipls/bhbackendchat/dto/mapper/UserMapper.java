package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.User;
import ua.haipls.bhbackendchat.dto.UserDto;


@Mapper(componentModel = "spring")
public interface UserMapper extends AbstractMapper<User,UserDto>{
}
