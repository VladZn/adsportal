package ru.geekbrains.vlad.service;

import ru.geekbrains.vlad.model.Category;

import java.util.List;

/**
 * @author Vladislav Zinchenko
 */

public interface CategoryService {
    List<Category> findAll();
}
