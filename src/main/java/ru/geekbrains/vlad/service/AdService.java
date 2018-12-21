package ru.geekbrains.vlad.service;

import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.model.Company;

import java.util.List;
import java.util.Optional;

/**
 * @author Vladislav Zinchenko
 */

public interface AdService {
    Ad create(Ad ad);

    Ad save(Ad ad);

    void delete(String id);

    Optional<Ad> findById(String id);

    Ad update(Ad ad);

    List<Ad> getAll();

    List<Ad> getAllWithCategory(String categoryId);

    Company getCompany(String id);
}
