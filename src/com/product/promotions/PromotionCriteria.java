package com.product.promotions;

public class PromotionCriteria {
	
	private int quantity;
	private String skuId;
	
	public PromotionCriteria(int quantity, String skuId) {
		super();
		this.quantity = quantity;
		this.skuId = skuId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	
	

}
