package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.dto.MessageDto;

@Mapper(componentModel = "spring")
public interface MessageMapper extends AbstractMapper<Message, MessageDto>{
}
