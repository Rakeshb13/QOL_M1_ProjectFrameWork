package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Page {
	
	@FindBy(id="updatecart")
	private WebElement update_Cart_Button;
	
	@FindBy(name="continueshopping")
	private WebElement continue_Shopping_Button;
	
	@FindBy(id="open-estimate-shipping-popup")
	private WebElement estimate_Shipping_Button;
	
	@FindBy(id="termsofservice")
	private WebElement terms_Of_Services_Button;
	
	@FindBy(id="checkout")
	private WebElement checkout_Button;
	
	public Shopping_Cart_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUpdate_Cart_Button() {
		return update_Cart_Button;
	}

	public WebElement getContinue_Shopping_Button() {
		return continue_Shopping_Button;
	}

	public WebElement getEstimate_Shipping_Button() {
		return estimate_Shipping_Button;
	}

	public WebElement getTerms_Of_Services_Button() {
		return terms_Of_Services_Button;
	}

	public WebElement getCheckout_Button() {
		return checkout_Button;
	}

}
