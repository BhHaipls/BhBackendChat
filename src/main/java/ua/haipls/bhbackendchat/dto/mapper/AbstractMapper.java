package ua.haipls.bhbackendchat.dto.mapper;


public interface AbstractMapper<T, O> {
    T toEntity(O dto);
    O toDto(T entity);
}
