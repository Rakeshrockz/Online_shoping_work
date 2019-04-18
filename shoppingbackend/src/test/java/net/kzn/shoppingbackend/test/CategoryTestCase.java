package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	/*
	 * @Test public void testAddCategory() { category=new Category();
	 * 
	 * category.setName("IPhoneX");
	 * category.setDescription("This rack contains televisions");
	 * category.setImageURL("CAT_IMAGE.png");
	 * 
	 * assertEquals("Succesffully adde to table",true,categoryDAO.add(category)); }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * Category category=categoryDAO.get(1);
	 * assertEquals("Succesffully adde to table","television",category.getName());
	 * System.out.println("category.getName()"+category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category=categoryDAO.get(1); category.setName("UpdateTv");
	 * assertEquals("Succesffully adde to table",true,categoryDAO.update(category));
	 * System.out.println("category.getName()"+category.getName()); //Part 03 - 08 -
	 * CRUD Operation JUnit Test Case 8.24 }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category=categoryDAO.get(1); category.setName("UpdateTv");
	 * assertEquals("Succesffully deleted to table",true,categoryDAO.delete(category
	 * )); }
	 */

	/*
	 * @Test public void testCategoryList() {
	 * 
	 * assertEquals("Succesffully fetched list form table",1,categoryDAO.list().size
	 * ()); }
	 */

	@Test
	public void testCRUDCategory() {
		
		//ADD operation
		category = new Category();

		category.setName("IPhoneX");
		category.setDescription("This rack contains televisions");
		category.setImageURL("CAT_IMAGE.png");

		assertEquals("Succesffully adde to table", true, categoryDAO.add(category));
		
		category = new Category();

		category.setName("TV");
		category.setDescription("This rack contains televisions");
		category.setImageURL("TV_IMAGE.png");

		assertEquals("Succesffully adde to table", true, categoryDAO.add(category));
		
		category=categoryDAO.get(2);
		category.setName("UpdateTv");
		assertEquals("Succesffully adde to table",true,categoryDAO.update(category));
		
		
		//Delete category
		assertEquals("Succesffully deleted to table",true,categoryDAO.delete(category));
		 
		 //List category
		assertEquals("Succesffully fetched list form table",9,categoryDAO.list().size());
		 
	}
}
