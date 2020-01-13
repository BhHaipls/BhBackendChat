package ua.haipls.bhbackendchat.dto.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Mute;
import ua.haipls.bhbackendchat.dto.MuteDto;
import ua.haipls.bhbackendchat.dto.MuteDto.MuteDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:33+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class MuteMapperImpl implements MuteMapper {

    @Override
    public Mute toEntity(MuteDto dto) {
        if ( dto == null ) {
            return null;
        }

        Mute mute = new Mute();

        mute.setId( dto.getId() );
        mute.setReason( dto.getReason() );
        mute.setDuration( dto.getDuration() );
        mute.setAuthor( dto.getAuthor() );
        mute.setVinous( dto.getVinous() );
        mute.setChannel( dto.getChannel() );

        return mute;
    }

    @Override
    public MuteDto toDto(Mute entity) {
        if ( entity == null ) {
            return null;
        }

        MuteDtoBuilder<?, ?> muteDto = MuteDto.builder();

        muteDto.id( entity.getId() );
        muteDto.reason( entity.getReason() );
        muteDto.duration( entity.getDuration() );
        muteDto.author( entity.getAuthor() );
        muteDto.vinous( entity.getVinous() );
        muteDto.channel( entity.getChannel() );

        return muteDto.build();
    }
}
