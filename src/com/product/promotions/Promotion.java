package com.product.promotions;

import java.util.List;

public class Promotion {
	
	private List<PromotionCriteria> criterias;
	private double discountedPrice;
	
	public Promotion(List<PromotionCriteria> criterias, double discountedPrice) {
		super();
		this.criterias = criterias;
		this.discountedPrice = discountedPrice;
	}
	public List<PromotionCriteria> getCriterias() {
		return criterias;
	}
	public void setCriterias(List<PromotionCriteria> criterias) {
		this.criterias = criterias;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	

}
