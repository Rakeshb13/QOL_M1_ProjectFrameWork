package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList_Page {
	
	@FindBy(id="updatecart")
	private WebElement update_WishList;
	
	@FindBy(name="addtocartbutton")
	private WebElement add_To_Cart;
	
	@FindBy(name="checkbox")
	private WebElement item_Select_Checkbox;
	
	@FindBy(xpath="//button[@class='remove-btn']")
	private WebElement remove_Item_Button;
	
	public WishList_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUpdate_WishList() {
		return update_WishList;
	}

	public WebElement getAdd_To_Cart() {
		return add_To_Cart;
	}

	public WebElement getItem_Select_Checkbox() {
		return item_Select_Checkbox;
	}

	public WebElement getRemove_Item_Button() {
		return remove_Item_Button;
	}
	

}
