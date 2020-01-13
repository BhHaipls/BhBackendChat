package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.haipls.bhbackendchat.dao.RoleRepo;
import ua.haipls.bhbackendchat.domain.Role;
import ua.haipls.bhbackendchat.dto.RoleDto;
import ua.haipls.bhbackendchat.dto.mapper.RoleMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

public class RoleService extends AbstractService<Role, RoleDto, RoleRepo, RoleMapper> {

    @Autowired
    public RoleService(RoleRepo repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}