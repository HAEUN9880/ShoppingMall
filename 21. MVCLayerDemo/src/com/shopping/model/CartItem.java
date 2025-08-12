package com.shopping.model;

import java.io.Serializable;

public class CartItem implements Serializable {

	private Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		//super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public int getTotalPrice() {
		return product.getPrice()*quantity;
	}
	
	
	
}
