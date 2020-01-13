package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.haipls.bhbackendchat.dao.UserRepo;
import ua.haipls.bhbackendchat.domain.User;
import ua.haipls.bhbackendchat.dto.UserDto;
import ua.haipls.bhbackendchat.dto.mapper.UserMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

public class UserService extends AbstractService<User, UserDto, UserRepo, UserMapper> {

    @Autowired
    public UserService(UserRepo repository,UserMapper banMapper) {
        super(repository, banMapper);
    }

}