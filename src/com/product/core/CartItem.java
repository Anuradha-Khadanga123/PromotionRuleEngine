package com.product.core;

public class CartItem {

	private String skuId;
	private int quantity;
	
	
	public CartItem(String skuId, int quantity) {
		super();
		this.skuId = skuId;
		this.quantity = quantity;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
