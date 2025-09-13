package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.CategoryDTO;
import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.dto.ProductProjectionDTO;
import com.devsuperior.dscommerce.entites.Category;
import com.devsuperior.dscommerce.entites.Product;
import com.devsuperior.dscommerce.projections.ProductProjectioMin;
import com.devsuperior.dscommerce.repository.CategoryRepository;
import com.devsuperior.dscommerce.repository.ProductRepository;
import com.devsuperior.dscommerce.services.exceptions.DatabaseException;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    @Transactional(readOnly = true)
    public List<CategoryDTO> buscarCategory(){
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }

}
