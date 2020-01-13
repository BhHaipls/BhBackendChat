package ua.haipls.bhbackendchat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import ua.haipls.bhbackendchat.dao.CommonRepository;
import ua.haipls.bhbackendchat.domain.AbstractEntity;
import ua.haipls.bhbackendchat.dto.AbstractDto;
import ua.haipls.bhbackendchat.dto.mapper.AbstractMapper;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@NoRepositoryBean
public abstract class AbstractService<E extends AbstractEntity,T extends AbstractDto, R extends CommonRepository<E>, M extends AbstractMapper<E,T>> implements CommonService<T> {

    protected final R repository;
    protected  final M abstractMapper;

    public AbstractService(R repository,M abstractMapper)
    {
        this.repository = repository;
        this.abstractMapper = abstractMapper;
    }


    @Override
    public T create(T t) {
        return abstractMapper.toDto(repository.save(abstractMapper.toEntity(t)));
    }

    @Override
    public T update(T t) {
        findById(t.getId());
        return abstractMapper.toDto(repository.save(abstractMapper.toEntity(t)));
    }

    @Override
    public List<T> findAll() {
        List<E> entitys = (List<E>) repository.findAll();
        return entitys.stream().map(abstractMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public T findById(Long id) {
        return abstractMapper.toDto(repository.findById(id).orElseThrow(() -> new EntityNotFoundException()));
    }
}