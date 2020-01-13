package ua.haipls.bhbackendchat.dto.mapper;

import org.mapstruct.Mapper;
import ua.haipls.bhbackendchat.domain.Ban;
import ua.haipls.bhbackendchat.dto.BanDto;

@Mapper(componentModel = "spring")
public interface BanMapper extends AbstractMapper<Ban,BanDto>{


}
