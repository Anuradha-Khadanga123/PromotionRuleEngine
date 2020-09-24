package com.product.promotion.calculator;

import java.util.List;

import com.product.core.CartItem;
import com.product.core.Product;
import com.product.promotions.Promotion;

public interface PromotionEngine {
	
	public double getDiscountPriceOnCart(List<CartItem> cart, List<Promotion> promotions, List<Product> products);

}
