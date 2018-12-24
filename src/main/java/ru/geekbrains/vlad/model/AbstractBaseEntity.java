package ru.geekbrains.vlad.model;

import org.springframework.data.domain.Persistable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Vladislav Zinchenko
 *
 */

@MappedSuperclass
public abstract class AbstractBaseEntity implements Persistable<String> {

    @Id
    protected String id = UUID.randomUUID().toString();

    public AbstractBaseEntity() {
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return this.id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractBaseEntity that = (AbstractBaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("Entity %s (%s)", getClass().getName(), id);
    }
}
