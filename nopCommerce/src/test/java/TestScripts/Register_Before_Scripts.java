package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Register_page;
import genericLiberary.RegisterBaseTest;

public class Register_Before_Scripts extends RegisterBaseTest{
	
	@Test
	public void register() {
		
		Register_page register_page =new Register_page(driver);
		
		register_page.getRegisterLink().click();
		register_page.getMaleRadioButton().click();
		register_page.getFirstNameRadioButton().sendKeys("Vru");
		register_page.getLastNameRadioButton().sendKeys("Gurjar");
		register_page.getEmailRadioButton().sendKeys("vru@abc.com");
		register_page.getPasswordRadioButton().sendKeys("qwerty");
		register_page.getConfirmPasswordRadioButton().sendKeys("qwerty");
		register_page.getRegisterRadioButton().click();
		
		String ExpectedText = "Your registration completed";
		String ActualText = register_page.getActualTextRegistrationComplete().getText();
		
		Assert.assertEquals(ActualText, ExpectedText);
		Reporter.log("Registration Done Successfully",true);
		
	}

}
