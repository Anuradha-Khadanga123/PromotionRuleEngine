package com.product.promotion.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.product.core.CartItem;
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
	void testGetDiscountPriceOnCart_Scenario1() {
		
		List<CartItem> cart = Arrays.asList(new CartItem("A", 1), new CartItem("B", 1), new CartItem("C", 1), new CartItem("D", 0));
		
		assertEquals(100.0, promotions.getDiscountPriceOnCart(cart, availablePromotions, products));
		
	}
	
	@Test
	void testGetDiscountPriceOnCart_Scenario2() {
		
		List<CartItem> cart = Arrays.asList(new CartItem("A", 5), new CartItem("B", 5), new CartItem("C", 1), new CartItem("D", 0));
		
		assertEquals(370.0, promotions.getDiscountPriceOnCart(cart, availablePromotions, products));
		
	}
	
	@Test
	void testGetDiscountPriceOnCart_Scenario3() {
		
		List<CartItem> cart = Arrays.asList(new CartItem("A", 3), new CartItem("B", 5), new CartItem("C", 1), new CartItem("D", 1));
		
		assertEquals(280.0, promotions.getDiscountPriceOnCart(cart, availablePromotions, products));
		
	}
	
	@Test
	void testGetDiscountPriceOnCart_Scenario4_Null() {
		
		List<CartItem> cart = Arrays.asList(new CartItem(null, 3), new CartItem("B", 5), new CartItem("C", 1), new CartItem("D", 1));
		
		assertThrows(NullPointerException.class, () -> {
			promotions.getDiscountPriceOnCart(cart, availablePromotions, products);	
		});
		
	}

}
