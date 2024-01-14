package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_page {
	
	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement register_link;
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login_link;
	
	@FindBy(xpath="(//a[text()='Computers '])[1]")
	private WebElement computer_Link;
	
	@FindBy(xpath="((//a[text()='Electronics '])[1]")
	private WebElement electronic_Link;
	
	@FindBy(xpath="((//a[text()='Apparel '])[1]")
	private WebElement apparel_Link;
	
	@FindBy(xpath="((//a[text()='Digital downloads '])[1]")
	private WebElement digital_Download_Link;
	
	@FindBy(xpath="((//a[text()='Books '])[1]")
	private WebElement books_Link;
	
	@FindBy(xpath="((//a[text()='Jewelry '])[1]")
	private WebElement jewelry_Link;

	@FindBy(xpath="((//a[text()='Gift Cards '])[1]")
	private WebElement gift_Card_Link;
	
	public Main_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegister_link() {
		return register_link;
	}

	public WebElement getLogin_link() {
		return login_link;
	}

	public WebElement getComputer_Link() {
		return computer_Link;
	}

	public WebElement getElectronic_Link() {
		return electronic_Link;
	}

	public WebElement getApparel_Link() {
		return apparel_Link;
	}

	public WebElement getDigital_Download_Link() {
		return digital_Download_Link;
	}

	public WebElement getBooks_Link() {
		return books_Link;
	}

	public WebElement getJewelry_Link() {
		return jewelry_Link;
	}

	public WebElement getGift_Card_Link() {
		return gift_Card_Link;
	}
}
