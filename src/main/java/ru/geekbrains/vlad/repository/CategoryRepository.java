package ru.geekbrains.vlad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.vlad.model.Category;

/**
 * @author Vladislav Zinchenko
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
