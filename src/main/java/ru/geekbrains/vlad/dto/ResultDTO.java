package ru.geekbrains.vlad.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Vladislav Zinchenko
 * 26.12.2018
 */

@Getter
@Setter
@XmlRootElement
public class ResultDTO {

    private boolean success;

    private String message;

}


