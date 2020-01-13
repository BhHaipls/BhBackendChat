package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Mute;
import ua.haipls.bhbackendchat.dto.MuteDto;

@Mapper(componentModel = "spring")
public interface MuteMapper extends AbstractMapper<Mute,MuteDto>{
}
