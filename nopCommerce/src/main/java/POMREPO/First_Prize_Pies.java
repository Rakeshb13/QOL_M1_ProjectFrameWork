package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Prize_Pies {
	
	@FindBy(xpath="//div[@class='product-name']")
	private WebElement product_Name;
	
	@FindBy(id="add-to-cart-button-38")
	private WebElement add_To_Cart_Button;
	
	@FindBy(xpath="//div[@class='short-description']")
	private WebElement short_Discription;
	
	@FindBy(id="add-to-wishlist-button-38")
	private WebElement add_To_WishList_Button;
	
	@FindBy(xpath="(//button[text()='Add to compare list'])[1]")
	private WebElement comapre_List_Button;
	
	public First_Prize_Pies(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getProduct_Name() {
		return product_Name;
	}

	public WebElement getAdd_To_Cart_Button() {
		return add_To_Cart_Button;
	}

	public WebElement getShort_Discription() {
		return short_Discription;
	}

	public WebElement getAdd_To_WishList_Button() {
		return add_To_WishList_Button;
	}

	public WebElement getComapre_List_Button() {
		return comapre_List_Button;
	}

	

}
