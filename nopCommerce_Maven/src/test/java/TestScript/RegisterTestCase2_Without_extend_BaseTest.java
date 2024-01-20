package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMREPO.RegisterPage;
import POMREPO.RegisterPage_POMCLASS;
import genericlibrary.BaseTest;

public class RegisterTestCase2_Without_extend_BaseTest {
	
	
	@Test
	public void Register()
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
	
	
	//Step3 : Navigate to Register page
	driver.findElement(By.partialLinkText("Register")).click();
	
	//Step4 : Validate Register Page is displayed or not
	Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Register" , "Register page is not displayed...");
	Reporter.log("Register page is displayed",true);
	
	RegisterPage_POMCLASS  register_page = new RegisterPage_POMCLASS(driver);
	
	register_page.getFemaleRadioButton().click();
	register_page.getFirstNameTextField().sendKeys("smruti");
	register_page.getLastNameTextField().sendKeys("panda");
	register_page.getDaydropdown().click();
	register_page.getMonthdropdown().click();
	register_page.getYeardropdown().click();
	register_page.getEmailTextField().sendKeys("smrutimayeepanda243@gmail.com");
	register_page.getCopmapnyNameTextField().sendKeys("Dumadu studios");
	register_page.getPasswordTextField().sendKeys("smruti@123");
	register_page.getConfirmpasswordTextField().sendKeys("smruti@123");
	register_page.getRegisterButton().click();
	
	
	
	String expText = register_page.getExpText().getText();
	String ActualText = "Your registration completed";
	Reporter.log(expText);
	
	//step8 : validating Register successful or not
	Assert.assertEquals(expText,ActualText);
	Reporter.log("Register TestCase Pass...", true);
	
	
	}
	
}
