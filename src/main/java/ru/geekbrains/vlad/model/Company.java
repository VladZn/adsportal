package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
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
@Table(name = "companies")
public class Company extends AbstractNamedEntity {

    private String description;

    @NotBlank
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company", cascade = CascadeType.ALL)
    private List<Ad> ads;

    public Company(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }

}
