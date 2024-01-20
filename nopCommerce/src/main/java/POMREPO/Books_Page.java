package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page {
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")
	private WebElement book_Name_1;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement book_Name_1_AddToCart_Button;
	
	@FindBy(xpath="(//button[text()='Add to wishlist'])[1]")
	private WebElement book1_wishList_button;
	
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
	private WebElement book_Name_2;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement book_Name_2_AddToCart_Button;
	
	@FindBy(xpath="(//button[text()='Add to wishlist'])[2]")
	private WebElement book2_wishList_button;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")
	private WebElement book_Name_3;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement book_Name_3_AddToCart_Button;
	
	@FindBy(xpath="(//button[text()='Add to wishlist'])[3]")
	private WebElement book3_wishList_button;
	
	

	public Books_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getBook_Name_1() {
		return book_Name_1;
	}

	public WebElement getBook_Name_1_AddToCart_Button() {
		return book_Name_1_AddToCart_Button;
	}

	public WebElement getBook_Name_2() {
		return book_Name_2;
	}

	public WebElement getBook_Name_2_AddToCart_Button() {
		return book_Name_2_AddToCart_Button;
	}

	public WebElement getBook_Name_3() {
		return book_Name_3;
	}

	public WebElement getBook_Name_3_AddToCart_Button() {
		return book_Name_3_AddToCart_Button;
	}
	
	public WebElement getBook1_wishList_button() {
		return book1_wishList_button;
	}

	public WebElement getBook2_wishList_button() {
		return book2_wishList_button;
	}

	public WebElement getBook3_wishList_button() {
		return book3_wishList_button;
	}

}
