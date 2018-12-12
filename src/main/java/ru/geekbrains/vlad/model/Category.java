package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Vladislav Zinchenko
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Ad> ads;

    public Category(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }
}
