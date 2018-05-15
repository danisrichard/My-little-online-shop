package com.project02.main.controller;

import com.project02.main.entity.Product;
import com.project02.main.utils.Pager;
import com.project02.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class IndexPageController {

	private static final int INITIAL_PAGE = 0;

	@Autowired
	private ProductService productService;

	@GetMapping("/home")
	public ModelAndView loadIndexPage(@RequestParam("page") Optional<Integer> pageNumb) {

		int ePage = (pageNumb.orElse(0) < 1) ? INITIAL_PAGE : pageNumb.get()-1;

		Page<Product> products = productService.findAllProductPage(new PageRequest(ePage, 5));
		Pager pager = new Pager(products);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("products", products);
		modelAndView.addObject("pager", pager);
		modelAndView.setViewName("/index");

		return modelAndView;
	}
	
}
