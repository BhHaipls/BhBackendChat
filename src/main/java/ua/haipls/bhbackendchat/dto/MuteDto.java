package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import ua.haipls.bhbackendchat.domain.Channel;
import ua.haipls.bhbackendchat.domain.User;

import java.time.Duration;

@Data
@Builder
public class MuteDto {

    private String reason;

    private Duration duration;

    private User author;

    private User vinous;

    private Channel channel;
}
