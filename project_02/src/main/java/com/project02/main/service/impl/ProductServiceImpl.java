package com.project02.main.service.impl;

import com.project02.main.dao.ProductRepository;
import com.project02.main.entity.Product;
import com.project02.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Page<Product> findAllProductPage(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
