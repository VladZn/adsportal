package ru.geekbrains.vlad.service;

import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.model.Company;

import java.util.List;

/**
 * @author Vladislav Zinchenko
 */

public interface AdService {
    Ad create(Ad ad);

    void delete(String id);

    Ad getOne(String id);

    Ad update(Ad ad);

    List<Ad> getAll();

    List<Ad> getAllWithCategory(String categoryId);

    Company getCompany(String id);
}
