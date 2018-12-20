package ru.geekbrains.vlad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.model.Company;

import java.util.List;

/**
 * @author Vladislav Zinchenko
 */

@Repository
public interface AdRepository extends JpaRepository<Ad, String> {

    List<Ad> findAdsByCategory_Id(String category_id);

    @Query("SELECT a FROM Ad a LEFT JOIN FETCH a.category LEFT JOIN FETCH a.company")
    List<Ad> findAll();
}
