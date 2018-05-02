package com.project02.main.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project02.main.entity.OrderEntity;

@Repository
public interface OrderFindRepostiory extends CrudRepository<OrderEntity, Long>{

}
