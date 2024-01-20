package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Books_Page;
import POMREPO.Main_page;
import genericLiberary.BaseTest;

public class BooksTestScript extends BaseTest {
	
	@Test
	public void Books() throws InterruptedException {
		
		Main_page main_page = new Main_page(driver);
		Books_Page books_page = new Books_Page(driver);
		
		main_page.getBooks_Link().click();
		
		String bookName1 = books_page.getBook_Name_1().getText();
		String bookName1seen = "Fahrenheit 451 by Ray Bradbury";
		Assert.assertEquals(bookName1seen,bookName1);
		Reporter.log(bookName1seen,true);
		
		String bookName2 = books_page.getBook_Name_2().getText();
		String bookName2seen = "First Prize Pies";
		Assert.assertEquals(bookName2, bookName2seen);
		Reporter.log(bookName2seen,true);
		
		String bookName3 = books_page.getBook_Name_3().getText();
		String bookName3seen = "Pride and Prejudice";
		Reporter.log(bookName3seen,true);
		Assert.assertEquals(bookName3, bookName3seen);
		
		books_page.getBook_Name_1_AddToCart_Button().click();
		Thread.sleep(2000);
		books_page.getBook_Name_2_AddToCart_Button().click();
		Thread.sleep(2000);
		books_page.getBook_Name_3_AddToCart_Button().click();
		Thread.sleep(4000);
		
	}

}
