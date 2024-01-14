package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	@FindBy(xpath="//a[@class='ico-account']")
	private WebElement myAccounts;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logOut;
	
	@FindBy(xpath="//a[@class='ico-wishlist']")
	private WebElement wishList;
	
	@FindBy(xpath="//a[@class='ico-cart']")
	private WebElement shoppingCart;
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	public Home_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyAccounts() {
		return myAccounts;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	

}
