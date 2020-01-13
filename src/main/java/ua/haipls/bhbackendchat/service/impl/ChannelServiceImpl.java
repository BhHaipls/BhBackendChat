package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.haipls.bhbackendchat.dao.ChannelRepo;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.dto.ChannelDto;
import ua.haipls.bhbackendchat.dto.mapper.ChannelMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

public class ChannelServiceImpl extends AbstractService<Channel, ChannelDto, ChannelRepo, ChannelMapper> {

    @Autowired
    public ChannelServiceImpl(ChannelRepo repository, ChannelMapper mapper) {
        super(repository, mapper);
    }
}
