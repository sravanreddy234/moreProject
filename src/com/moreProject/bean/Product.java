package com.moreProject.bean;

import java.awt.Image;

import com.moreProject.FileUtil.FileUtil;

public class Product {

	private String ProductId;
	private String ProductName;
	private String ProductDesc;
	private String Price;
	//private int quantity;
	private Image imageUrl;

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDesc() {
		return ProductDesc;
	}

	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	/*public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}*/

	public Image getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(Image imageUrl) {
		this.imageUrl = imageUrl;
	}

}
