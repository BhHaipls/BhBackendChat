package ua.haipls.bhbackendchat.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.domain.User;

import java.util.List;

@Data
@SuperBuilder
public class ChannelDto extends AbstractDto {

    private String name;

    private List<User> userList;

    private User author;

    private List<Message> messageList;
}
