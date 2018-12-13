package ru.geekbrains.vlad.service;

import ru.geekbrains.vlad.model.Company;

/**
 * @author Vladislav Zinchenko
 */

public interface CompanyService {
    Company getOne(String id);
}
