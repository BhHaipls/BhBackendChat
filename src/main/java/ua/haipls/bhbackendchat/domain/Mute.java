package ua.haipls.bhbackendchat.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.time.Duration;

@Data
@Entity
public class Mute extends  AbstractEntity {

    @Column(name = "reason",length = 256)
    @NotBlank
    private String reason;

    @Column
    private Duration duration;

    @ManyToOne
    private User author;

    @ManyToOne
    private User vinous;

    @ManyToOne
    private Channel channel;


}
