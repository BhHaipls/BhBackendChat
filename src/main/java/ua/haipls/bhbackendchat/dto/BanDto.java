package ua.haipls.bhbackendchat.dto;


import lombok.Data;
import lombok.experimental.SuperBuilder;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.domain.User;

import java.time.Duration;

@Data
@SuperBuilder
public class BanDto extends AbstractDto {

    private String reason;

    private Duration duration;

    private User author;

    private User vinous;

    private Channel channel;

}
