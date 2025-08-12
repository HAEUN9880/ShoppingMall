package com.shopping.model;

import java.util.Map;

public class Cart {
	private Map<String, CartItem> items;

	public Cart(Map<String, CartItem> items) {
		//super();
		this.items = items;
	}

	public Map<String, CartItem> getItems() {
		return items;
	}
	
	
	
	
}
