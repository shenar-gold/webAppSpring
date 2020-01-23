package com.sh.mycafe.controllers;


public class Order {

	private String orderName;
	private String customerName;
	
	void setOrderName(String on){
		this.orderName = on;
	}
	void setCustomerName(String cn) {
		this.customerName = cn;
	}
	
	public String getOrderName() {
		return this.orderName;
	}
	public String getCustomerName() {
		return this.customerName;
	}
}
