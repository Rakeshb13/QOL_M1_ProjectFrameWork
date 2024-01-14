package TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Register_page;
import genericLiberary.BaseTest;

public class registerNopCommerceTest extends BaseTest{
	
	@Test
	
	public void register() {
		
		Register_page register_page = new Register_page(driver);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		register_page.getMaleRadioButton().click();
		register_page.getFirstNameRadioButton().sendKeys("Vru");
		register_page.getLastNameRadioButton().sendKeys("Gurjar");
		register_page.getEmailRadioButton().sendKeys("qwerty"+utility_methods.getRandomNumber()+"@abc.com");
		register_page.getPasswordRadioButton().sendKeys("qwerty");
		register_page.getConfirmPasswordRadioButton().sendKeys("qwerty");
		register_page.getRegisterRadioButton().click();
	
		
		
		
		String register = "Your registration completed";
		String actual_text = driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		Assert.assertEquals(actual_text, register);
		Reporter.log("Regestration is done",true);
		
//		if(actual_text.equals(register)) {
//			System.out.println("Account is created");
//		}
//		else {
//			System.out.println("Account already existed");
//		}
//				
		
	}
	
	
	

}
