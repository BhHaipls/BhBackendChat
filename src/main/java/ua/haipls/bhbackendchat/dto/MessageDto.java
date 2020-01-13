package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import ua.haipls.bhbackendchat.domain.User;


@Data
@Builder
public class MessageDto extends BaseDto {

    private String title;

    private User author;
}
