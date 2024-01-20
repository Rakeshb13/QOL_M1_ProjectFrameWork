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
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement AddtocartButton1;
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement AddtocartButton2;
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement AddtocartButton3;
	@FindBy(id="add-to-wishlist-button-38")
	private WebElement Addtowishlist;
	
	public BooksPage_POMCLASS(WebDriver driver) {
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

	public WebElement getAddtocartButton1() {
		return AddtocartButton1;
	}

	public WebElement getAddtocartButton2() {
		return AddtocartButton2;
	}

	public WebElement getAddtocartButton3() {
		return AddtocartButton3;
	}

	public WebElement getAddtowishlist() {
		return Addtowishlist;
	}
	
	
	

}
