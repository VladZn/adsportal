package ru.geekbrains.vlad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.dto.AdDTO;
import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.model.Company;
import ru.geekbrains.vlad.repository.AdRepository;
import ru.geekbrains.vlad.repository.CategoryRepository;
import ru.geekbrains.vlad.repository.CompanyRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Vladislav Zinchenko
 * 13.12.2018
 */

@Service
@Transactional(readOnly = true)
public class AdServiceImpl implements AdService{

    private final AdRepository repository;

    private final CategoryRepository categoryRepository;

    private final CompanyRepository companyRepository;

    @Autowired
    public AdServiceImpl(AdRepository repository, CategoryRepository categoryRepository, CompanyRepository companyRepository) {
        this.repository = repository;
        this.categoryRepository = categoryRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    @Transactional
    public Ad create(Ad ad) {
        return repository.save(ad);
    }

    @Override
    @Transactional
    public void save(final AdDTO adDTO) {
        if (adDTO == null) return;
        Optional<Ad> optional = repository.findById(adDTO.getId());
        Ad ad = optional.orElseGet(Ad::new);
        ad.setId(adDTO.getId());
        ad.setName(adDTO.getName());
        ad.setContent(adDTO.getContent());
        ad.setPhoneNum(adDTO.getPhoneNum());
        ad.setCategory(categoryRepository.getOne(adDTO.getCategoryId()));
        ad.setCompany(companyRepository.getOne(adDTO.getCompanyId()));
        repository.save(ad);
    }

    @Override
    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Ad> findById(String id) {
        return repository.findById(id);
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
