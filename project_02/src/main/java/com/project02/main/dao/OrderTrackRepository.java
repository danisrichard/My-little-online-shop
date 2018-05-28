package com.project02.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project02.main.entity.OrderEntity;

import java.util.Optional;

@Repository
public interface OrderTrackRepository extends CrudRepository<OrderEntity, Long>{
        Optional<OrderEntity> findById(Long id);
}
