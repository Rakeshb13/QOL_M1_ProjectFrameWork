package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPrizePies_POMCLASS {
	@FindBy(linkText="First Prize Pies")
	private WebElement productName;
	@FindBy(xpath="//div[contains(@class,'short-description')]")
	private WebElement Description;
	@FindBy(id="add-to-cart-button-38")
	private WebElement AddcartButton;
	@FindBy(id="add-to-wishlist-button-38")
	private WebElement AddtowishlistButton;
	@FindBy(linkText="Add to compare list")
	private WebElement AddtocomparelistButton;
	@FindBy(linkText="Email a friend")
	private WebElement EmailafriendButton;
	
	public FirstPrizePies_POMCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getAddcartButton() {
		return AddcartButton;
	}

	public WebElement getAddtowishlistButton() {
		return AddtowishlistButton;
	}

	public WebElement getAddtocomparelistButton() {
		return AddtocomparelistButton;
	}

	public WebElement getEmailafriendButton() {
		return EmailafriendButton;
	}

}
