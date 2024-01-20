package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage_POMCLASS {
	@FindBy(linkText="First Prize Pies")
	private WebElement productName;
	@FindBy(id="updatecart")
	private WebElement UpdatewishlistButton;
	@FindBy(linkText="Add to cart")
	private WebElement AddtocartButton;
	@FindBy(linkText="Email a friend")
	private WebElement EmailafriendButton;
	@FindBy(xpath="(//button[contains(@name,'updatecart')])[1]")
	private WebElement Removefromcart;
	
	public WishListPage_POMCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getUpdatewishlistButton() {
		return UpdatewishlistButton;
	}

	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}

	public WebElement getEmailafriendButton() {
		return EmailafriendButton;
	}

	public WebElement getRemovefromcart() {
		return Removefromcart;
	}

	
}
