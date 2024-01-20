package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.BooksPage_POMCLASS;
import POMREPO.HomePage_POMCLASS;
import POMREPO.ShoppingCart_POMCLASS;
import genericlibrary.BaseTest;

public class ShoppingcartTestCase {
	
	@Test
	public  void shoppingCart() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step-1:Navigate to Demo web Shop
		driver.get("https://demo.nopcommerce.com/");
		
		//step-2: perform login with credentials
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("smrutimayeepanda243@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("smruti@123");
		driver.findElement(By.linkText("Log in")).click();
		
		HomePage_POMCLASS home_page = new HomePage_POMCLASS(driver);
		ShoppingCart_POMCLASS shopping_cart = new ShoppingCart_POMCLASS(driver);
		BooksPage_POMCLASS books_page = new BooksPage_POMCLASS(driver);
		
		home_page.getBooksPageLink().click();
		books_page.getProductName().click();
		books_page.getProductName2().click();
		books_page.getProductName3().click();
		books_page.getAddtocartButton1().click();
		Thread.sleep(2000);
		books_page.getAddtocartButton2().click();
		Thread.sleep(2000);
		books_page.getAddtocartButton3().click();
		Thread.sleep(2000);
		home_page.getShoppingCartLink().click();
		Thread.sleep(2000);
		shopping_cart.getProductRemoveButton1().click();
		Thread.sleep(2000);
		shopping_cart.getProductRemoveButton2().click();
		Thread.sleep(3000);
		shopping_cart.getProductRemoveButton3().click();
		Thread.sleep(4000);
		String Actual_Text = shopping_cart.getGetEmptyCartMessage().getText();
		String Expected_Text = "Your Shopping Cart is empty!";
		
		Assert.assertEquals(Actual_Text, Expected_Text);
		Reporter.log("Shopping cart is Empty",true);
				
	}


}
