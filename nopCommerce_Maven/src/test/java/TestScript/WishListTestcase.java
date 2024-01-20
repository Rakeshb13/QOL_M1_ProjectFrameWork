package TestScript;

import java.time.Duration;

import org.apache.poi.sl.draw.geom.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.BooksPage_POMCLASS;
import POMREPO.HomePage_POMCLASS;
import POMREPO.WishListPage_POMCLASS;
import genericlibrary.BaseTest;

public class WishListTestcase {
	
	
	//Navigate to Wishlist
	@Test
	public void wishlist() throws InterruptedException 
	{
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
		BooksPage_POMCLASS books_page = new BooksPage_POMCLASS(driver);
		WishListPage_POMCLASS wishlist_page = new WishListPage_POMCLASS(driver);
		
		//step-1:click on books
		home_page.getBooksPageLink().click();
		
		//step-2:Click on First Prize Pies
		books_page.getProductName2().click();
		
		//step-3:click on wish list button
		books_page.getAddtowishlist().click();
		
		//step-4:click on wish list page
		home_page.getWishlistLink().click();
		
		//step5: Verify the book is present in wish list page
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'First Prize Pies')]"));
		Reporter.log(text.getText());
		
		String actualText = "First Prize Pies";
		
		if (text.getText().equals(actualText)) {
			Reporter.log("Product is present",true);
		} else {
			Reporter.log("Product is not present",true);
		}
		
		Thread.sleep(3000);

		//step6 : Selecting and then removing the book from the wish list
		wishlist_page.getRemovefromcart().click();
	
		
		//step7 : verify product is removed or not
		WebElement currentText = driver.findElement(By.xpath("//div[@class='no-data']"));
		Reporter.log(currentText.getText());
		
		String fixedText = "The wishlist is empty!";
		
		Assert.assertEquals(currentText.getText(), fixedText);
		Reporter.log("Test case is pass", true);
		
		if (currentText.getText().equals(fixedText)) {
			Reporter.log("Passed, wishlist is empty",true);	
		} else {
			Reporter.log("Failed, wishlist is not empty",true);

		}
		
		
	}

}
