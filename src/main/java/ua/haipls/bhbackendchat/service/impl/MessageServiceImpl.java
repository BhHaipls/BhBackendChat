package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.haipls.bhbackendchat.dao.MessageRepo;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.dto.MessageDto;
import ua.haipls.bhbackendchat.dto.mapper.MessageMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

public class MessageServiceImpl extends AbstractService<Message, MessageDto, MessageRepo, MessageMapper> {

    @Autowired
    public MessageServiceImpl(MessageRepo repository,MessageMapper mapper) {
        super(repository, mapper);
    }

}
