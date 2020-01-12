package ua.haipls.bhbackendchat.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
public class Message extends BaseEntity {

    @Column(name = "title")
    @NotBlank
    private String title;

    @ManyToOne
    @NotBlank
    private User author;


}