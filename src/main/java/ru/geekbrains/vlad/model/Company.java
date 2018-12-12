package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Company extends AbstractNamedEntity {

    private String description;

    private String address;

    public Company(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }
}
