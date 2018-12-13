package ru.geekbrains.vlad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.vlad.model.Company;
import ru.geekbrains.vlad.repository.CompanyRepository;

/**
 * @author Vladislav Zinchenko
 */

@Service
public class CompanyServiceImpl implements CompanyService{

    private final CompanyRepository repository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Company getOne(String id) {
        return repository.getOne(id);
    }
}
