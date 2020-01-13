package ua.haipls.bhbackendchat.dao;

import org.springframework.stereotype.Repository;
import ua.haipls.bhbackendchat.domain.Message;


@Repository
public interface MessageRepo extends CommonRepository<Message> {
}
