package ua.haipls.bhbackendchat.dto.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Ban;
import ua.haipls.bhbackendchat.dto.BanDto;
import ua.haipls.bhbackendchat.dto.BanDto.BanDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:33+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class BanMapperImpl implements BanMapper {

    @Override
    public Ban toEntity(BanDto dto) {
        if ( dto == null ) {
            return null;
        }

        Ban ban = new Ban();

        ban.setId( dto.getId() );
        ban.setReason( dto.getReason() );
        ban.setDuration( dto.getDuration() );
        ban.setAuthor( dto.getAuthor() );
        ban.setVinous( dto.getVinous() );
        ban.setChannel( dto.getChannel() );

        return ban;
    }

    @Override
    public BanDto toDto(Ban entity) {
        if ( entity == null ) {
            return null;
        }

        BanDtoBuilder<?, ?> banDto = BanDto.builder();

        banDto.id( entity.getId() );
        banDto.reason( entity.getReason() );
        banDto.duration( entity.getDuration() );
        banDto.author( entity.getAuthor() );
        banDto.vinous( entity.getVinous() );
        banDto.channel( entity.getChannel() );

        return banDto.build();
    }
}
