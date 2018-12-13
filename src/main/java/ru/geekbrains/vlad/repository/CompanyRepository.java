package ru.geekbrains.vlad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.model.Company;

/**
 * @author Vladislav Zinchenko
 */

@Repository
@Transactional(readOnly = true)
public interface CompanyRepository extends JpaRepository<Company, String> {

}
