package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage_POMCLASS {
	@FindBy(linkText="Fahrenheit 451 by Ray Bradbury")
	private WebElement productName;
	@FindBy(linkText="First Prize Pies")
	private WebElement productName2;
	@FindBy(linkText="Pride and Prejudice")
	private WebElement productName3;
	@FindBy(linkText="Add to cart")
	private WebElement AddtocartButton;
	@FindBy(linkText="Add to wishlist")
	private WebElement AddtowishlistButton;
	
	public BooksPage_POMCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductName2() {
		return productName2;
	}

	public WebElement getProductName3() {
		return productName3;
	}

	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}

	public WebElement getAddtowishlistButton() {
		return AddtowishlistButton;
	}
	

}
