package com.qa.jdbc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductRepositoryTest {
	
	@Test
	public void createProductTest() {
		ProductRepository repository = new ProductRepository();
		Product product = new Product(2, "Cat food", 0.87, 1.72); 
		boolean created = repository.createProduct(product);
		assertTrue(created);
	}

}
