package com.product.promotion.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.product.core.CartItem;
import com.product.core.Product;
import com.product.promotions.Promotion;
import com.product.promotions.PromotionCriteria;

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
		
		/*
		 * A list to add the discounted prices
		 */
		List<Double> discountedPrice = new ArrayList<Double>();
		
		boolean checkForDiscounts = true;
		/*
		 * Discount validator
		 */
		while(checkForDiscounts) {
			
			Optional<Promotion> matchedPromotion = promotions.stream().filter(p -> isCriteriaSaticefy(p.getCriterias(), cartMap)).findFirst();
			/*
			 * Validating the available promotions and adding the discounted price to list
			 */
			if(matchedPromotion.isPresent()) {
				matchedPromotion.get().getCriterias().forEach(cr -> {
					cartMap.put(cr.getSkuId(), cartMap.get(cr.getSkuId())- cr.getQuantity());
				});
				
				discountedPrice.add(matchedPromotion.get().getDiscountedPrice());
			}
		}
		return 0;
	}

	public boolean isCriteriaSaticefy(List<PromotionCriteria> criterias, Map<String, Integer> cartMap) {
		// TODO Auto-generated method stub
		return true;
	}

}
