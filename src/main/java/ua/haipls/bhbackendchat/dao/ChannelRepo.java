package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.Channel;

public interface ChannelRepo extends CrudRepository<Channel,Long> {
}
