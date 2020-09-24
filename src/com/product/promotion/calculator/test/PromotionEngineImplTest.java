package com.product.promotion.calculator.test;

import java.util.Arrays;
import java.util.List;

import com.product.core.Product;
import com.product.promotion.calculator.PromotionEngineImpl;

public class PromotionEngineImplTest {
	
	PromotionEngineImpl promotions = new PromotionEngineImpl();
	/*
	 * List of available products
	 */
	List<Product> products = Arrays.asList(new Product("A",50), new Product("B",30), new Product("C",20),new Product("D",15));
	
	
	

}
