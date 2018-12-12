package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * @author Vladislav Zinchenko
 *
 */

@MappedSuperclass
public abstract class AbstractBaseEntity {

    @Id
    @Getter
    @Setter
    protected String id = UUID.randomUUID().toString();
}
