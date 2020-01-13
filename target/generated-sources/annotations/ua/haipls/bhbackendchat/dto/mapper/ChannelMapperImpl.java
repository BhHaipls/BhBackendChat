package ua.haipls.bhbackendchat.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.domain.User;
import ua.haipls.bhbackendchat.dto.ChannelDto;
import ua.haipls.bhbackendchat.dto.ChannelDto.ChannelDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:33+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class ChannelMapperImpl implements ChannelMapper {

    @Override
    public Channel toEntity(ChannelDto dto) {
        if ( dto == null ) {
            return null;
        }

        Channel channel = new Channel();

        channel.setId( dto.getId() );
        channel.setName( dto.getName() );
        List<User> list = dto.getUserList();
        if ( list != null ) {
            channel.setUserList( new ArrayList<User>( list ) );
        }
        channel.setAuthor( dto.getAuthor() );
        List<Message> list1 = dto.getMessageList();
        if ( list1 != null ) {
            channel.setMessageList( new ArrayList<Message>( list1 ) );
        }

        return channel;
    }

    @Override
    public ChannelDto toDto(Channel entity) {
        if ( entity == null ) {
            return null;
        }

        ChannelDtoBuilder<?, ?> channelDto = ChannelDto.builder();

        channelDto.id( entity.getId() );
        channelDto.name( entity.getName() );
        List<User> list = entity.getUserList();
        if ( list != null ) {
            channelDto.userList( new ArrayList<User>( list ) );
        }
        channelDto.author( entity.getAuthor() );
        List<Message> list1 = entity.getMessageList();
        if ( list1 != null ) {
            channelDto.messageList( new ArrayList<Message>( list1 ) );
        }

        return channelDto.build();
    }
}
