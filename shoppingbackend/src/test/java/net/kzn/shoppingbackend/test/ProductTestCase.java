package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
/*	@Test
	public void testCRUDProduct() {
		
		// create operation
		product = new Product();
				
		product.setName("Apple Iphone8x");
		product.setBrand("Oppo");
		product.setDescription("This is some description for iphone mobile phones!");
		product.setUnitPrice(125000);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(4);
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productDAO.add(product));		
		
		
		// reading and updating the category
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating the existing record!",
				true,productDAO.update(product));		
				
		assertEquals("Something went wrong while deleting the existing record!",
				true,productDAO.delete(product));		
		
		// list
		assertEquals("Something went wrong while fetching the list of products!",
				8,productDAO.list().size());		
				
	}
	*/		
	
	/*@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products!",
				5,productDAO.listActiveProducts().size());				
	} 
	
	
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wrong while fetching the list of products!",
				2,productDAO.listActiveProductsByCategory(1).size());
	} 
	
	@Test
	public void testGetLatestActiveProduct() {
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.getLatestActiveProducts(3).size());
		
	} */
	@Test
	public void listActiveProducts() {
		
		assertEquals("Something went wromg while fetching active produtcs",7,productDAO.listActiveProducts().size());
	}
	
	
	/*@Test
	public void listActiveProductsByCategory() {
		
		assertEquals("Something went wromg while fetching active produtcs cat",4,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wromg while fetching active produtcs cat",3,productDAO.listActiveProductsByCategory(1).size());

	}*/
	
	/*@Test
	public void latestActiveProductsByCategory() {
		
		assertEquals("Something went wromg while fetching active produtcs cat",3,productDAO.getLatestActiveProducts(3).size());

	}*/
	
		
}
