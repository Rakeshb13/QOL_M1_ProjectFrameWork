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
import genericlibrary.BaseTest;

public class BooksPageTestCase  {
		
		@Test
		public void Books() throws InterruptedException {
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
			
			//step-3:click on books page link
			home_page.getBooksPageLink().click();
			
			
			
			String bookName1 = books_page.getProductName().getText();
			String bookName1seen = "Fahrenheit 451 by Ray Bradbury";
			Assert.assertEquals(bookName1seen,bookName1);
			Reporter.log(bookName1seen,true);
			
			String bookName2 = books_page.getProductName2().getText();
			String bookName2seen = "First Prize Pies";
			Assert.assertEquals(bookName2, bookName2seen);
			Reporter.log(bookName2seen,true);
			
			String bookName3 = books_page.getProductName3().getText();
			String bookName3seen = "Pride and Prejudice";
			Reporter.log(bookName3seen,true);
			Assert.assertEquals(bookName3, bookName3seen);
			
			books_page.getProductName().click();
			books_page.getProductName2().click();
			books_page.getProductName3().click();
			
			//step-4:add all books in add to cart
			books_page.getAddtocartButton1().click();
			Thread.sleep(2000);
			books_page.getAddtocartButton2().click();
			Thread.sleep(3000);
			books_page.getAddtocartButton3().click();
			Thread.sleep(4000);
			
		}

	}


