package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.Role;

public interface RoleRepo extends CrudRepository<Role,Long> {
}
