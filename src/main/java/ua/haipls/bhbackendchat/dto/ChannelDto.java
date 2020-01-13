package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import ua.haipls.bhbackendchat.domain.Message;
import ua.haipls.bhbackendchat.domain.User;

import java.util.List;

@Data
@Builder
public class ChannelDto extends BaseDto {

    private String name;

    private List<User> userList;

    private User author;

    private List<Message> messageList;
}
