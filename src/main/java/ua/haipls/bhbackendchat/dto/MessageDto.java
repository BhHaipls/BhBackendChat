package ua.haipls.bhbackendchat.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import ua.haipls.bhbackendchat.domain.User;


@Data
@SuperBuilder
public class MessageDto extends AbstractDto {

    private String title;

    private User author;
}
