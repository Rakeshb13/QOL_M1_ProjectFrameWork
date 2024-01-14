package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart_POMCLASS {
	@FindBy(linkText="Night Visions")
	private WebElement productName1;
	@FindBy(linkText="First Prize Pies")
	private WebElement productName2;
	@FindBy(id="updatecart")
	private WebElement UpadateShoppingCartButton;
	@FindBy(linkText="Continue shopping")
	private WebElement ContinueShoppingcartButton;
	@FindBy(id="open-estimate-shipping-popup")
	private WebElement EstimateShoppingcartButton;
	@FindBy(id="checkout_attribute_1")
	private WebElement GiftwrappingBox;
	@FindBy(id="discountcouponcode")
	private WebElement DiscountCodeTextBox;
	@FindBy(id="giftcardcouponcode")
	private WebElement GiftcardTextBox;
	@FindBy(id="applygiftcardcouponcode")
	private WebElement AddgiftcardButton;
	@FindBy(id="termsofservice")
	private WebElement TandCcheckBox;
	@FindBy(id="checkout")
	private WebElement CheckoutButton;
	
	public ShoppingCart_POMCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName1() {
		return productName1;
	}

	public WebElement getProductName2() {
		return productName2;
	}

	public WebElement getUpadateShoppingCartButton() {
		return UpadateShoppingCartButton;
	}

	public WebElement getContinueShoppingcartButton() {
		return ContinueShoppingcartButton;
	}

	public WebElement getEstimateShoppingcartButton() {
		return EstimateShoppingcartButton;
	}

	public WebElement getGiftwrappingBox() {
		return GiftwrappingBox;
	}

	public WebElement getDiscountCodeTextBox() {
		return DiscountCodeTextBox;
	}

	public WebElement getGiftcardTextBox() {
		return GiftcardTextBox;
	}

	public WebElement getAddgiftcardButton() {
		return AddgiftcardButton;
	}

	public WebElement getTandCcheckBox() {
		return TandCcheckBox;
	}

	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}
}
