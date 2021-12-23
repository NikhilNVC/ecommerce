package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.pojo.Product;
import com.example.ecommerce.repository.ProductsRepository;

@RestController
public class ProductController {

	@Autowired
	ProductsRepository productRepository;
	
	@RequestMapping("/getAllProducts")
    @ResponseBody
    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }
	
	@RequestMapping("/getProductById")
	@ResponseBody
	public Product getProductById(int id) {
		return productRepository.getProductById(id);
	}
}
