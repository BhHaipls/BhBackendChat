package ua.haipls.bhbackendchat.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
public class BaseDto {

    private Long id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;


}
