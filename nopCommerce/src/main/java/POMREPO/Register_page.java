package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Register_page {
	

	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement RegisterLink;
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameRadioButton;
	
	@FindBy(id="LastName")
	private WebElement lastNameRadioButton;
	
	@FindBy(id="Email")
	private WebElement emailRadioButton;
	
	@FindBy(id="Password")
	private WebElement passwordRadioButton;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordRadioButton;
	
	@FindBy(id="register-button")
	private WebElement registerRadioButton;
	
	@FindBy(id="Company")
	private WebElement CompanyName;

	@FindBy(xpath="//div[text()='Your registration completed']")
	private WebElement ActualTextRegistrationComplete;
	

	public Register_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameRadioButton() {
		return firstNameRadioButton;
	}

	public WebElement getLastNameRadioButton() {
		return lastNameRadioButton;
	}

	public WebElement getEmailRadioButton() {
		return emailRadioButton;
	}

	public WebElement getPasswordRadioButton() {
		return passwordRadioButton;
	}

	public WebElement getConfirmPasswordRadioButton() {
		return confirmPasswordRadioButton;
	}
	
	public WebElement getCompanyName() {
		return CompanyName;
	}

	public WebElement getRegisterRadioButton() {
		return registerRadioButton;
	}
	
	public WebElement getActualTextRegistrationComplete() {
		return ActualTextRegistrationComplete;
	}

}
