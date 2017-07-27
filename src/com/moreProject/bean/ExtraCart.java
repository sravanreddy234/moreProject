package com.moreProject.bean;

public class ExtraCart {
	
	private String Name;
	private Double Price;
	private int quantity;
	private String ProDesc;
<<<<<<< HEAD
	private String proId;
	
	
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public Double getTotal() {
		return Price*quantity;
	}
	
=======
	private Double Total;
	
	
	
	
	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = Price*quantity;
	}
>>>>>>> origin/master
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
