package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.Mute;

public interface MuteRepo extends CrudRepository<Mute,Long> {
}
