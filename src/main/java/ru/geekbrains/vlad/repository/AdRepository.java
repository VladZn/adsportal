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
@Transactional
public interface AdRepository extends JpaRepository<Ad, String> {

    List<Ad> findAdsByCategory_Id(String category_id);

    @Query("SELECT a.company FROM Ad a JOIN FETCH a.company WHERE a.id = :id")
    Company getCompany(String id);
}
