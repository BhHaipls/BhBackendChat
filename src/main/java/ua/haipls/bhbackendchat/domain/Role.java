package ua.haipls.bhbackendchat.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Data
public class Role extends AbstractEntity {

    @Column
    private String name;
}