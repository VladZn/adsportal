package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.geekbrains.vlad.AbstractNamedEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Vladislav Zinchenko
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ad extends AbstractNamedEntity {

    @NotBlank
    @Size(min = 10, max = 255)
    private String content;

    @NotBlank
    @Size(min = 12, max = 12)
    private String phoneNum;

    @NotNull
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Ad(@NotBlank @Size(min = 2, max = 100) String name) {
        super(name);
    }

    public Ad(@NotBlank @Size(min = 2, max = 100) String name, @NotBlank @Size(min = 10, max = 255) String content,
              @NotBlank @Size(min = 12, max = 12) String phoneNum, @NotNull Category category) {
        super(name);
        this.content = content;
        this.phoneNum = phoneNum;
        this.category = category;
    }
}
