package com.moreProject.bean;

public class ExtraCart {
	
	private String Name;
	private Double Price;
	private int quantity;
	private String ProDesc;
	private Double Total;
	
	
	
	
	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = Price*quantity;
	}
	public String getProDesc() {
		return ProDesc;
	}
	public void setProDesc(String proDesc) {
		ProDesc = proDesc;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
