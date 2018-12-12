package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.geekbrains.vlad.AbstractNamedEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Vladislav Zinchenko
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends AbstractNamedEntity {

    public Category(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }
}
