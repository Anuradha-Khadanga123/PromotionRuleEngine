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
		
		/*
		 * Getting the list of items in the cart
		 */
		Map<String, Integer> cartMap = cart.stream().collect(Collectors.toMap(CartItem::getSkuId, CartItem::getQuantity));
		return 0;
	}

}
