package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Shopping_cart {
	
	@FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[7]/button")
	private WebElement removeButton1;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[2]/td[7]/button")
	private WebElement removeButton2;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[3]/td[7]/button")
	private WebElement removeButton3;
	
	@FindBy(xpath="//div[@class='no-data']")
	private WebElement emptyCartMessage;
	
	public Update_Shopping_cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemoveButton1() {
		return removeButton1;
	}

	public WebElement getRemoveButton2() {
		return removeButton2;
	}

	public WebElement getRemoveButton3() {
		return removeButton3;
	}

	public WebElement getEmptyCartMessage() {
		return emptyCartMessage;
	}
	

}
