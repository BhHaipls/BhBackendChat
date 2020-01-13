package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Ban;
import ua.haipls.bhbackendchat.dto.BanDto;

@Mapper
public interface BanMapper {
    Ban toEntity(BanDto dto);

    BanDto toDto(Ban entity);
}
