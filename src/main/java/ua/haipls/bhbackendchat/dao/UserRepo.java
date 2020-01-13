package ua.haipls.bhbackendchat.dao;

import org.springframework.stereotype.Repository;
import ua.haipls.bhbackendchat.domain.User;


@Repository
public interface UserRepo extends CommonRepository<User> {
}
