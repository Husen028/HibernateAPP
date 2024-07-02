package com.app;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int custid;
	private String custName;
	
	@ManyToOne(cascade =  CascadeType.PERSIST)
	private Shop shop;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Customer(String custName, Shop shop) {
		super();
		this.custName = custName;
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", shop=" + shop + "]";
	}
}
