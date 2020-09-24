package com.product.promotion.calculator.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.product.core.Product;
import com.product.promotion.calculator.PromotionEngineImpl;
import com.product.promotions.Promotion;
import com.product.promotions.PromotionCriteria;

public class PromotionEngineImplTest {
	
	PromotionEngineImpl promotions = new PromotionEngineImpl();
	/*
	 * List of available products
	 */
	List<Product> products = Arrays.asList(new Product("A",50), new Product("B",30), new Product("C",20),new Product("D",15));
	/*
	 * List of available promotions
	 * 
	 * More promotions can be added here in future
	 */
	List<Promotion> availablePromotions = Arrays.asList(new Promotion(Arrays.asList(new PromotionCriteria(3,"A")), 130),
														new Promotion(Arrays.asList(new PromotionCriteria(2,"B")), 45),
	
														new Promotion(Arrays.asList(new PromotionCriteria(1,"C"),new PromotionCriteria(1,"D")), 30));
	
	@Test
	void testGetDiscountPriceOnCart() {
		
		
		
	}

}
