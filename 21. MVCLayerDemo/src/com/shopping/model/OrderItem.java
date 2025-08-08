package com.shopping.model;

import java.time.LocalDateTime;
import java.util.List;

/*
 * 최종 수정일 : 2025.08.08 JHE
 * OrderItem : Order는 여러 상품을 포함하니까, 상품 1개에 대한 정보를 별도로 담는 클래스 필요
 * 	주문 시점에 선택된 상품 + 수량 + 당시 가격을 표현
 */



public class OrderItem {

	// 1. 필드
    private String productId;  // 상품 ID
    private String productName; // 상품명
    private int quantity;      // 수량
    private int unitPrice;     // 개당 가격

    // 2. 생성자
    public OrderItem(String productId, String productName, int quantity, int unitPrice) {
		//super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

    
    // 3. Getter/Setter

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getUnitPrice() { return unitPrice; }
    public void setUnitPrice(int unitPrice) { this.unitPrice = unitPrice; }

    public int getTotalPrice() {
        return unitPrice * quantity;
    }


	// 4. toString
	@Override
	public String toString() {
		return "OrderItem [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + "]";
	}


    
}
