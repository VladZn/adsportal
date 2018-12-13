package ru.geekbrains.vlad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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
@ToString
@NoArgsConstructor
@Table(name = "ads")
public class Ad extends AbstractNamedEntity {

    @NotBlank
    @Size(min = 10, max = 255)
    private String content;

    @NotBlank
    @Size(min = 12, max = 12)
    private String phoneNum;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

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
