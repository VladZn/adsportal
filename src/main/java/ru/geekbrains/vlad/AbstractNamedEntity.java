package ru.geekbrains.vlad;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.geekbrains.vlad.model.AbstractBaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Vladislav Zinchenko
 *
 */

@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractNamedEntity extends AbstractBaseEntity {

    @Getter
    @Setter
    @NotBlank
    @Size(min = 2, max = 100)
    @Column(name = "name")
    protected String name;

    public AbstractNamedEntity(@NotBlank @Size(min = 2, max = 100) String name) {
        this.name = name;
    }
}

