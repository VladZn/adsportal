package ru.geekbrains.vlad.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.geekbrains.vlad.model.Ad;

/**
 * @author Vladislav Zinchenko
 * 27.12.2018
 */

@Getter
@Setter
@NoArgsConstructor
public class AdDTO extends AbstractDTO {

    private String content;

    private String phoneNum;

    //    private CategoryDTO categoryDTO;
    private String categoryId;

    //    private CompanyDTO companyDTO;
    private String companyId;

    public AdDTO(final Ad ad) {
        this.id = ad.getId();
        this.name = ad.getName();
        this.content = ad.getContent();
        this.phoneNum = ad.getPhoneNum();
        this.categoryId = ad.getCategory().getId();
        this.companyId = ad.getCompany().getId();
    }
}
