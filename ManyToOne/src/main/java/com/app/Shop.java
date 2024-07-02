package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int shopId;
	private String shopName;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Shop(String shopName) {
		super();
		this.shopName = shopName;
	}
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + "]";
	}
	
}
