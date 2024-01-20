package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class RegisterPage_POMCLASS {
	@FindBy(id="gender-male")
	private WebElement MaleRadioButton;
	@FindBy(id="gender-female")
	private WebElement FemaleRadioButton;
	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	@FindBy(xpath="(//option[@value='10'])[1]")
	private WebElement Daydropdown;
	@FindBy(xpath="(//option[@value='4'])[1]")
	private WebElement Monthdropdown;
	@FindBy(xpath="(//option[@value='1999'])[1]")
	private WebElement Yeardropdown;
	@FindBy(id="Email")
	private WebElement EmailTextField;
	@FindBy(id="Company")
	private WebElement CopmapnyNameTextField;
	@FindBy(id="Password")
	private WebElement passwordTextField;
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmpasswordTextField;
	@FindBy(id="register-button")
	private WebElement RegisterButton;
	@FindBy(xpath="//div[@class='result']")
	private WebElement expText;
	
	public RegisterPage_POMCLASS(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getDaydropdown() {
		return Daydropdown;
	}

	public WebElement getMonthdropdown() {
		return Monthdropdown;
	}

	public WebElement getYeardropdown() {
		return Yeardropdown;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getCopmapnyNameTextField() {
		return CopmapnyNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmpasswordTextField() {
		return ConfirmpasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public WebElement getExpText() {
		return expText;
	}

	
}

