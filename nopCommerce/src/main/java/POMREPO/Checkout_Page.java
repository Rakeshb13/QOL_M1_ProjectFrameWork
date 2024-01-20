package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {
	
	@FindBy(xpath="//option[@value='133']")
	private WebElement country;
	
	@FindBy(name="BillingNewAddress.City")
	private WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement addressLine1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement pincode;
	
	@FindBy(name="BillingNewAddress.PhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(xpath="(//button[text()='Continue'])[1]")
	private WebElement continueButton1;
	
	@FindBy(xpath="(//button[text()='Continue'])[3]")
	private WebElement continueButton3;
	
	@FindBy(xpath="(//button[text()='Continue'])[4]")
	private WebElement continueButton4;
	
	@FindBy(xpath="(//button[text()='Continue'])[5]")
	private WebElement continueButton5;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement confirmOrder;
	
	@FindBy(xpath="//h1[text()='Thank you']")
	private WebElement thankYouText;
	
	@FindBy(xpath="//strong[text()='Your order has been successfully processed!']")
	private WebElement orderSuccessfullyPlaced;
	
	public Checkout_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddressLine1() {
		return addressLine1;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getContinueButton1() {
		return continueButton1;
	}

	public WebElement getContinueButton3() {
		return continueButton3;
	}

	public WebElement getContinueButton4() {
		return continueButton4;
	}

	public WebElement getContinueButton5() {
		return continueButton5;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getThankYouText() {
		return thankYouText;
	}

	public WebElement getOrderSuccessfullyPlaced() {
		return orderSuccessfullyPlaced;
	}

}
