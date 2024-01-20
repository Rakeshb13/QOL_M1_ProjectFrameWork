package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Home_page;
import POMREPO.Main_page;
import genericLiberary.RegisterBaseTest;

public class Login_page_Test_script extends RegisterBaseTest {
	
	@Test
	public void Login_page() {
		
		Main_page main_page = new Main_page(driver);
		POMREPO.Login_page login_page = new POMREPO.Login_page(driver);
		Home_page home_page = new Home_page(driver);
		
		main_page.getLogin_link().click();
		
		login_page.getEmail_Text_Field().sendKeys("vru@abc.com");
		login_page.getPassword_Text_Field().sendKeys("qwerty");
		login_page.getLogin_Button().click();
		
		String logOutText = home_page.getLogOut().getText();
		String ActualLogOutText = "Log out";
		
		Assert.assertEquals(logOutText, ActualLogOutText);
		Reporter.log("Login Successfull",true);
		
	}

}
