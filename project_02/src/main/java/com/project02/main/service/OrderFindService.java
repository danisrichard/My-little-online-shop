package com.project02.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.OrderFindRepostiory;
import com.project02.main.entity.OrderEntity;

@Service
public class OrderFindService {

	@Autowired
	OrderFindRepostiory orderFindRepostiory;
	
	public Optional<OrderEntity> getOrderItemsByID(Long id) {
		
			return orderFindRepostiory.findById(id);
	}
	
}
