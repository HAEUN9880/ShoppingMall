package com.shopping.model;

/*
 * 최종 수정일 : 2025.08.08 JHE
 * Order : 쇼핑몰에서 Order는 상품 + 구매자 + 주문 상태 + 날짜 같은 핵심 데이터를 담는 객체
 * 
 */

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Order implements Serializable {
    
	// 1. 필드
    private String orderId;          // 주문 ID (고유값)
    private String userId;           // 주문자 ID
    private List<OrderItem> items;   // 주문 상품 목록
    private int totalPrice;          // 총 주문 금액
    private LocalDateTime orderDate; // 주문일시
    private String status;           // 주문 상태 (예: PENDING, SHIPPED, DELIVERED, CANCELED)
	

    // 2. 생성자
    public Order(String orderId, String userId, List<OrderItem> items, int totalPrice, LocalDateTime orderDate,
			String status) {
		//super();
		this.orderId = orderId;
		this.userId = userId;
		this.items = items;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.status = status;
	}

    
    // 3. Getter/Setter
	public String getOrderId() { return orderId; }
	public void setOrderId(String orderId) { this.orderId = orderId; }

	public String getUserId() { return userId; }
	public void setUserId(String userId) { this.userId = userId; }

	public List<OrderItem> getItems() { return items; }
	public void setItems(List<OrderItem> items) { this.items = items; }

	public int getTotalPrice() { return totalPrice; }
	public void setTotalPrice(int totalPrice) { this.totalPrice = totalPrice; }


	public LocalDateTime getOrderDate() { return orderDate; }
	public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }
	
	
	
	// 4. 편의 메서드
    public void addItem(OrderItem item) {
        this.items.add(item);
        this.totalPrice += item.getTotalPrice();
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
        this.totalPrice -= item.getTotalPrice();
    }

    
    // 5. toString
	@Override
	public String toString() {
		return String.format("주문ID: %s, 사용자ID: %s, 총금액: %d원, 상태: %s, 날짜: %s",
                orderId, userId, totalPrice, status, orderDate);
	}


	// 6. equals & hashCode
	@Override
	public int hashCode() {
		return Objects.hash(items, orderDate, orderId, status, totalPrice, userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(items, other.items) && Objects.equals(orderDate, other.orderDate)
				&& Objects.equals(orderId, other.orderId) && Objects.equals(status, other.status)
				&& totalPrice == other.totalPrice && Objects.equals(userId, other.userId);
	} 
   
	
	
}
