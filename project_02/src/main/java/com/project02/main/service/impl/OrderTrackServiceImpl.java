package com.project02.main.service.impl;

import com.project02.main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.OrderTrackRepository;
import com.project02.main.service.OrderTrackService;

import java.util.List;

@Service
public class OrderTrackServiceImpl implements OrderTrackService {

	@Autowired
	private OrderTrackRepository orderFindRepostiory;

	@Override
	public List<Product> getProductsByID(Long orderId) {
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) {

	}
}
