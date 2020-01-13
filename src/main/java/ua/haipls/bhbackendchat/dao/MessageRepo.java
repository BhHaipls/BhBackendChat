package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.Message;

public interface MessageRepo extends CrudRepository<Message,Long> {
}
