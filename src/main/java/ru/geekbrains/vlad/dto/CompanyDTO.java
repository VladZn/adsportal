package ru.geekbrains.vlad.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vladislav Zinchenko
 * 27.12.2018
 */

@Getter
@Setter
@NoArgsConstructor
public class CompanyDTO extends AbstractDTO {

    private String description;

    private String address;

}
