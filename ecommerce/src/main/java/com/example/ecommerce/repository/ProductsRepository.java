package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.pojo.Product;

@Repository
public class ProductsRepository {

	@Autowired
	JdbcTemplate productTemplate;
	
	public List<Product> getProducts(){
		
		List<Product> products = productTemplate.query("select product_id, product_name, product_price, product_model from 	ecommerce.products", (result,rowNum)->new Product(result.getInt("product_id"),
                result.getString("product_name"),result.getInt("product_price"),result.getString("product_model")));
		
		return products;
		 
	}
	
	public Product getProductById(int id) {
		Product product = productTemplate.queryForObject("select * from ecommerce.products where product_id = ?", new Object[] {id}, new BeanPropertyRowMapper<>(Product.class));
		return product;
	}
	
}
