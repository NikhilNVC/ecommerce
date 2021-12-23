package com.example.ecommerce.pojo;

import java.sql.Date;

public class Product {

	private int product_id;
	
	private String product_name;
	
	private int product_price;
	
	private String product_model;
	
	private Date created_date;
	
	private Date last_updated;

	public int getId() {
		return product_id;
	}

	public void setId(int id) {
		this.product_id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_model() {
		return product_model;
	}

	public void setProduct_model(String product_model) {
		this.product_model = product_model;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	
	
	
	public Product(int id, String product_name, int product_price, String product_model) {
		super();
		this.product_id = id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_model = product_model;
	}

	public Product(int id, String product_name, int product_price, String product_model, Date created_date,
			Date last_updated) {
		super();
		this.product_id = id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_model = product_model;
		this.created_date = created_date;
		this.last_updated = last_updated;
	}

	@Override
	public String toString() {
		return "Product [id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", product_model=" + product_model + ", created_date=" + created_date + ", last_updated="
				+ last_updated + "]";
	}
	
	
}
