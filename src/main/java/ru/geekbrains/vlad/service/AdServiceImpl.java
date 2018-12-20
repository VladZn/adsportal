package ru.geekbrains.vlad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.model.Company;
import ru.geekbrains.vlad.repository.AdRepository;

import java.util.List;

/**
 * @author Vladislav Zinchenko
 * 13.12.2018
 */

@Service
@Transactional(readOnly = true)
public class AdServiceImpl implements AdService{

    private final AdRepository repository;

    @Autowired
    public AdServiceImpl(AdRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Ad create(Ad ad) {
        return repository.save(ad);
    }

    @Override
    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Ad getOne(String id) {
        return repository.getOne(id);
    }

    @Override
    @Transactional
    public Ad update(Ad ad) {
        return repository.save(ad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Ad> getAllWithCategory(String categoryId) {
        return repository.findAdsByCategory_Id(categoryId);
    }

    @Override
    public Company getCompany(String id) {
        return repository.getOne(id).getCompany();
    }
}
