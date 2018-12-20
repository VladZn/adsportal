package ru.geekbrains.vlad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.model.Company;
import ru.geekbrains.vlad.repository.CompanyRepository;

/**
 * @author Vladislav Zinchenko
 */

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{

    private final CompanyRepository repository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Company getOne(String id) {
        return repository.getOne(id);
    }
}
