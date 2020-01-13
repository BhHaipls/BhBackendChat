package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import ua.haipls.bhbackendchat.domain.Ban;

public interface BanRepo extends CrudRepository<Ban,Long> {
}
