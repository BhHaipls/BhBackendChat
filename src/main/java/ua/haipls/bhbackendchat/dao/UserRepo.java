package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.User;

public interface UserRepo extends CrudRepository<User,Long> {
}
