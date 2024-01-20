package TestScript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMREPO.RegisterPage;
import POMREPO.RegisterPage_POMCLASS;
import genericlibrary.BaseTest;
import genericlibrary.RegisterBaseTest;

public class RegisterTestCase extends RegisterBaseTest {
	
	
	@Test
	public void Register()
	{

	//{
//		driver.findElement(By.linkText("Log out")).click();
	//}
	
	
	//Step3 : Navigate to Register page
	driver.findElement(By.partialLinkText("Register")).click();
	
	//Step4 : Validate Register Page is displayed or not
	Assert.assertEquals(driver.getTitle(),"nopCommerce demo store.Register" , "Register page is not displayed...");
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
