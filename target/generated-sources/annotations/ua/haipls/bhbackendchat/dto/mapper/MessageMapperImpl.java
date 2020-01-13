package ua.haipls.bhbackendchat.dto.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.dto.MessageDto;
import ua.haipls.bhbackendchat.dto.MessageDto.MessageDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:25:33+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public Message toEntity(MessageDto dto) {
        if ( dto == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( dto.getId() );
        message.setTitle( dto.getTitle() );
        message.setAuthor( dto.getAuthor() );

        return message;
    }

    @Override
    public MessageDto toDto(Message entity) {
        if ( entity == null ) {
            return null;
        }

        MessageDtoBuilder<?, ?> messageDto = MessageDto.builder();

        messageDto.id( entity.getId() );
        messageDto.title( entity.getTitle() );
        messageDto.author( entity.getAuthor() );

        return messageDto.build();
    }
}
