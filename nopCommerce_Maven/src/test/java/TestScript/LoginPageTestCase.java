package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.HomePage_POMCLASS;

public class LoginPageTestCase {
	@Test
	public void Login_page() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step-1:Navigate to Demo web Shop
		driver.get("https://demo.nopcommerce.com/");
		
		HomePage_POMCLASS home_page = new HomePage_POMCLASS(driver);
		POMREPO.LoginPage_POMCLASS login_page = new POMREPO.LoginPage_POMCLASS(driver);
		
		
		home_page.getLoginLink().click();
		
		login_page.getEmailTextField().sendKeys("smrutimayeepanda243@gmail.com");
		login_page.getPasswordTextField().sendKeys("smruti@123");
		login_page.getLoginButton().click();
		
		String logOutText = home_page.getLoginLink().getText();
		String ActualLogOutText = "Log out";
		
		Assert.assertEquals(logOutText, ActualLogOutText);
		Reporter.log("Login Successfull",true);
		
	}

}
