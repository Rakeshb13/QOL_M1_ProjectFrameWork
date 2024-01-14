package TestScript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMREPO.RegisterPage;
import genericlibrary.BaseTest;

public class RegisterTestCase extends BaseTest {
	
	
	@Test
	public void Register()
	{

	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	
	//Step3 : Navigate to Register page
	driver.findElement(By.partialLinkText("Register")).click();
	
	//Step4 : Validate Register Page is displayed or not
	Assert.assertEquals(driver.getTitle(),"nopCommerce demo store.Register" , "Register page is not displayed...");
	Reporter.log("Register page is displayed",true);
	
	RegisterPage  register_page = new RegisterPage(driver);
	
	register_page.getFemaleRadioButton().click();
	register_page.getFirstNameTextField().sendKeys("smruti");
	register_page.getLastNameTextField().sendKeys("panda");
	register_page.getEmailTextField().sendKeys("a"+utility_Methods.getRandomNumber()+"@abc");
	register_page.getPasswordTextField().sendKeys("smruti@123");
	register_page.getConfirmpasswordTextField().sendKeys("smruti@123");
	register_page.getRegisterButton().click();
	
	//step7 : Fetching the register successful message
	String expText =driver.findElement(By.xpath("//div[@class='result']")).getText();
	Reporter.log(expText);
	
	//step8 : validating Register successful or not
	Assert.assertEquals(expText,"Your registration completed", "Register TestCase Fail");
	Reporter.log("Register TestCase Pass...", true);
	
	
	}
	
}
