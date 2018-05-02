package com.project02.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.OrderFindRepostiory;
import com.project02.main.service.OrderFindService;

@Service
public class OrderFindServiceImpl implements OrderFindService{

	@Autowired
	private OrderFindRepostiory orderFindRepostiory;
}
