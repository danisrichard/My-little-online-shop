package com.project02.main.controller;

import com.project02.main.entity.Product;
import com.project02.main.utils.Pager;
import com.project02.main.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class IndexPageController {

	private static final Logger logger = LogManager.getLogger(IndexPageController.class);

	private static final int INITIAL_PAGE = 0;

	@Autowired
	private ProductService productService;

	@GetMapping(value={"/home","/",""})
	public String loadIndexPage(@RequestParam("page") Optional<Integer> pageNumb,Model model) {

		int ePage = (pageNumb.orElse(0) < 1) ? INITIAL_PAGE : pageNumb.get() - 1;

		Page<Product> products = productService.findAllProductPage( PageRequest.of(ePage, 6));
		Pager pager = new Pager(products);

		model.addAttribute("products", products);
		model.addAttribute("pager", pager);

		return "index";
	}
}
