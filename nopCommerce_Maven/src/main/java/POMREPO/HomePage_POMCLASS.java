package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POMCLASS {
	@FindBy(linkText="Register")
	private WebElement RegisterLink;
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement LoginLink;
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement LogoutLink;
	@FindBy(linkText="Shopping cart")
	private WebElement shoppingCartLink;
	@FindBy(id="small-searchterms")
	private WebElement searchStoreTextBox;
	@FindBy(linkText="Search")
	private WebElement SearchButton;
	@FindBy(linkText="Computers ")
	private WebElement ComputerspageLink;
	@FindBy(linkText="Electronics ")
	private WebElement ElectronicsPageLink;
	@FindBy(linkText="Apparel ")
	private WebElement ApparealPageLink;
	@FindBy(xpath="(//a[text()='Digital downloads '])[1]")
	private WebElement DigitalDownloadsPageLink;
	@FindBy(xpath="(//a[text()='Books '])[1]")
	private WebElement BooksPageLink;
	@FindBy(linkText="Jewelry ")
	private WebElement JewelryPageLink;
	@FindBy(linkText="Gift Cards ")
	private WebElement GiftCardspageLink;
	@FindBy(xpath="(//button[text()='Add to cart'])")
	private WebElement LocateallAddToCartbuttons;
	
	public HomePage_POMCLASS(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getSearchStoreTextBox() {
		return searchStoreTextBox;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getComputerspageLink() {
		return ComputerspageLink;
	}

	public WebElement getElectronicsPageLink() {
		return ElectronicsPageLink;
	}

	public WebElement getApparealPageLink() {
		return ApparealPageLink;
	}

	public WebElement getDigitalDownloadsPageLink() {
		return DigitalDownloadsPageLink;
	}

	public WebElement getBooksPageLink() {
		return BooksPageLink;
	}

	public WebElement getJewelryPageLink() {
		return JewelryPageLink;
	}

	public WebElement getGiftCardspageLink() {
		return GiftCardspageLink;
	}

	public WebElement getLocateallAddToCartbuttons() {
		return LocateallAddToCartbuttons;
	}

	
	
}
