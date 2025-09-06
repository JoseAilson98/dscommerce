package com.devsuperior.dscommerce.repository;

import com.devsuperior.dscommerce.entites.Product;
import com.devsuperior.dscommerce.projections.ProductProjectioMin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

public interface ProductRepository extends JpaRepository <Product,Long> {


    @NativeQuery(value = "SELECT * "
            +"FROM tb_product "
            +"WHERE UPPER (name) LIKE UPPER(CONCAT('%',:name,'%'))",
    countQuery = "SELECT count(*) "
            +"FROM tb_product "
            +"WHERE UPPER (name) LIKE UPPER(CONCAT('%',:name,'%'))")
    Page<ProductProjectioMin> buscarProductMin (String name, Pageable pageable);


}
