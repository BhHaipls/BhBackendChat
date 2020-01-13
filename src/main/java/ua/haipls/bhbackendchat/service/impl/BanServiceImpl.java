package ua.haipls.bhbackendchat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.haipls.bhbackendchat.dao.BanRepo;
import ua.haipls.bhbackendchat.domain.Ban;
import ua.haipls.bhbackendchat.dto.BanDto;
import ua.haipls.bhbackendchat.dto.mapper.BanMapper;
import ua.haipls.bhbackendchat.service.AbstractService;

@Service
public class BanServiceImpl extends AbstractService<Ban, BanDto, BanRepo, BanMapper> {

    @Autowired
    public BanServiceImpl(BanRepo repository,BanMapper banMapper) {
        super(repository, banMapper);
    }

}
