package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POMCLASS {
	@FindBy(id="Email")
	private WebElement emailTextField;
	@FindBy(id="Password")
	private WebElement passwordTextField;
	@FindBy(partialLinkText="Log in")
	private WebElement LoginButton;
	
	public LoginPage_POMCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	
	
}
