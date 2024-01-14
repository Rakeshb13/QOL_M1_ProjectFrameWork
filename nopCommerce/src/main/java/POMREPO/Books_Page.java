package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page {
	
	@FindBy(xpath="//a[text()='Fahrenheit 451 by Ray Bradbury']")
	private WebElement book_Name_1;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement book_Name_1_AddToCart_Button;
	
	@FindBy(xpath="//a[text()='First Prize Pies']")
	private WebElement book_Name_2;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement book_Name_2_AddToCart_Button;
	
	@FindBy(xpath="//a[text()='Pride and Prejudice']")
	private WebElement book_Name_3;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement book_Name_3_AddToCart_Button;
	
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

}
