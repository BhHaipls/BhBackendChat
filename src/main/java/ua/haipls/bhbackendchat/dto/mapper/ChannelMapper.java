package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.dto.ChannelDto;

@Mapper
public interface ChannelMapper {
    Channel toEntity(ChannelDto dto);
    ChannelDto toDto(Channel entity);
}
