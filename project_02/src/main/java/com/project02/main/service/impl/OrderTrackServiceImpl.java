package com.project02.main.service.impl;

import com.project02.main.entity.OrderEntity;
import com.project02.main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.OrderTrackRepository;
import com.project02.main.service.OrderTrackService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderTrackServiceImpl implements OrderTrackService {

	@Autowired
	private OrderTrackRepository orderTrackRepository;

	@Override
	public Optional<OrderEntity> getProductsByID(Long orderId) {

		Optional<OrderEntity> orderEntityList = orderTrackRepository.findById(orderId);
		return orderEntityList;
	}

	@Override
	public void deleteOrder(Long orderId) {
		orderTrackRepository.deleteById(orderId);
	}
}
