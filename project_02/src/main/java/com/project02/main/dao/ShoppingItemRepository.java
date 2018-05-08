package com.project02.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project02.main.entity.Product;

@Repository
public interface ShoppingItemRepository extends CrudRepository<Product, Long> {

}
