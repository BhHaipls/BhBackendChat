package ua.haipls.bhbackendchat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ua.haipls.bhbackendchat.domain.AbstractEntity;

@NoRepositoryBean
public interface CommonRepository <E extends AbstractEntity> extends CrudRepository<E, Long> {
}
