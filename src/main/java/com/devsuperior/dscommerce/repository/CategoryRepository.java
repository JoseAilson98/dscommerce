package com.devsuperior.dscommerce.repository;

import com.devsuperior.dscommerce.entites.Category;
import com.devsuperior.dscommerce.entites.Product;
import com.devsuperior.dscommerce.projections.ProductProjectioMin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository <Category,Long> {

}
