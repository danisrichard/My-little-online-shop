package com.project02.main.service.impl;

import com.project02.main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.OrderFindRepostiory;
import com.project02.main.service.OrderFindService;

import java.util.List;

@Service
public class OrderFindServiceImpl implements OrderFindService{

	@Autowired
	private OrderFindRepostiory orderFindRepostiory;

	@Override
	public List<Product> getProductsByID(Long orderId) {
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) {

	}
}
