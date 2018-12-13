package ru.geekbrains.vlad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.vlad.model.Category;
import ru.geekbrains.vlad.repository.CategoryRepository;

import java.util.List;

/**
 * @author Vladislav Zinchenko
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
