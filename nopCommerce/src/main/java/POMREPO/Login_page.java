package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy(id="Email")
	private WebElement email_Text_Field;
	
	@FindBy(id="Password")
	private WebElement password_Text_Field;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login_Button;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgot_Password_Link;
	
	public Login_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail_Text_Field() {
		return email_Text_Field;
	}

	public WebElement getPassword_Text_Field() {
		return password_Text_Field;
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}

	public WebElement getForgot_Password_Link() {
		return forgot_Password_Link;
	}
	
}
