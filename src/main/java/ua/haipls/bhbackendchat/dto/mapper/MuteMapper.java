package ua.haipls.bhbackendchat.dto.mapper;

import ua.haipls.bhbackendchat.domain.Mute;
import ua.haipls.bhbackendchat.dto.MuteDto;

public interface MuteMapper {
    Mute toEntity(MuteDto dto);
    MuteDto toDto(Mute entity);
}
