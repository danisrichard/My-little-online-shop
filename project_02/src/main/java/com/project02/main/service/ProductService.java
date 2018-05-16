package com.project02.main.service;

import com.project02.main.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    Page<Product> findAllProductPage(Pageable pageable);

    List<Product> findAll();
}
