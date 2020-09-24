package com.product.promotion.calculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.product.core.CartItem;
import com.product.core.Product;
import com.product.promotions.Promotion;

public class PromotionEngineImpl implements PromotionEngine{

	@Override
	public double getDiscountPriceOnCart(List<CartItem> cart, List<Promotion> promotions, List<Product> products) {
		/*
		 * Getting the price list per unit for all the products
		 */
		Map<String,Double> productPriceMap = products.stream().collect(Collectors.toMap(Product::getSKUId, Product::getPrice));
		
		
		return 0;
	}

}
