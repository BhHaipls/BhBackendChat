package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.haipls.bhbackendchat.dao.MuteRepo;
import ua.haipls.bhbackendchat.domain.Mute;
import ua.haipls.bhbackendchat.dto.MuteDto;
import ua.haipls.bhbackendchat.dto.mapper.MuteMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

public class MuteService extends AbstractService<Mute, MuteDto, MuteRepo, MuteMapper> {

    @Autowired
    public MuteService(MuteRepo repository, MuteMapper mapper) {
        super(repository, mapper);
    }
}