package com.moreProject.bean;

public class Cart {
	
	private String CartId;	
	private String ProductId;
	private String UserId;
	private String productName;
	private String Price;
	private int quantity;

	private int total;
	
	

	public String getCartId() {
		return CartId;
	}

	public void setCartId(String cartId) {
		CartId = cartId;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	

}
