package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@ToString
@NoArgsConstructor
@Table(name = "companies")
public class Company extends AbstractNamedEntity {

    private String description;

    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Ad> ads;

    public Company(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }
}
