package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Home_page;
import POMREPO.Update_Shopping_cart;
import genericLiberary.BaseTest;

public class Update_Shoppingcart_TestScript extends BaseTest {
	
	@Test
	public void shoppingCart() throws InterruptedException {
		
		Home_page home_page = new Home_page(driver);
		Update_Shopping_cart shopping_cart = new Update_Shopping_cart(driver);
		
		home_page.getShoppingCart().click();
		shopping_cart.getRemoveButton1().click();
		shopping_cart.getRemoveButton2().click();
		shopping_cart.getRemoveButton3().click();
		Thread.sleep(2000);
		String Actual_Text = shopping_cart.getEmptyCartMessage().getText();
		String Expected_Text = "Your Shopping Cart is empty!";
		
		Assert.assertEquals(Actual_Text, Expected_Text);
		Reporter.log("Shopping cart is Empty",true);
				
	}

}
