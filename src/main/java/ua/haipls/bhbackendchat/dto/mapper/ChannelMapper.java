package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.dto.ChannelDto;

@Mapper(componentModel = "spring")
public interface ChannelMapper extends AbstractMapper<Channel, ChannelDto>{

}
