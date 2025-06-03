package com.projetofinal.escolinha.respository;

import com.projetofinal.escolinha.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
