package com.qa.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;

public class ProductRepositoryTest {
	
	@Ignore
	@Test
	public void createProductTest() {
		ProductRepository repository = new ProductRepository();
		Product product = new Product(3, "Cat food", 0.87, 1.72); 
		boolean created = repository.createProduct(product);
		assertTrue(created);
	}
	
	@Test
	public void updateProductTest() {
		ProductRepository repository = new ProductRepository();
		Product product = new Product(3, "Cat food", 0.87, 2.45); 
		boolean updated = repository.updateProduct(product);
		assertTrue(updated);
	}
	
	@Test
	public void readProductTest() {
		ProductRepository repository = new ProductRepository();
		Product product = repository.readProduct(1);
		assertEquals(1, product.getId());
	}
	
	@Test
	public void readProductOptionalTest() {
		ProductRepository repository = new ProductRepository();
		
		Optional<Product> optional = repository.readProductOptional(1);
		
		assertTrue(optional.isPresent() && optional.get().getId() ==1);
	}

}
