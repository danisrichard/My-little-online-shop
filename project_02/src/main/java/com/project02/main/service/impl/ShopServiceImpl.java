package com.project02.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.ShoppingItemRepository;

@Service
public class ShopServiceImpl {

	@Autowired
	private ShoppingItemRepository shoppingItemRepository;
}
