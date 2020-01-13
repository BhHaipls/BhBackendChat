package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.dto.MessageDto;

@Mapper
public interface MessageMapper {
    Message toEntity(MessageDto dto);

    MessageDto toDto(Message entity);
}
