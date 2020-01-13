package ua.haipls.bhbackendchat.service;

import ua.haipls.bhbackendchat.dto.AbstractDto;

import java.util.List;


public interface CommonService<T extends AbstractDto> {

    T create(T t);

    T update(T t);

    List<T> findAll();

    void deleteById(Long id);

    T findById(Long id);

}
