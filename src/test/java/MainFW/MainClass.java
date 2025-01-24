package MainFW;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import AbstractComponents.BaseTest;
import AbstractComponents.OrderPage;

public class MainClass extends BaseTest {
	
	String Productname= "IPHONE 13 PRO";
	String CVV = "123";
	String CardHolder = "Bryan Adams";
	String Country = "India";
	String ConfirmationMessage = "Thankyou for the order.";

	
	@Test
	public void SubmitOrder() throws InterruptedException, IOException {

		
		Products productCatlogue = loginPage.Login("Deshmukh@yopmail.com", "Deshmukh@123");
		productCatlogue.addToCart(Productname);
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck(Productname);
		AssertJUnit.assertTrue(Match);
		Shipping shipping =cartPage.checkOut();
		shipping.ProductVerification(CVV, CardHolder, Country);
		ConfirmationPage CNFRMPage = shipping.SubmitOrder();
		boolean TxtConfirm = CNFRMPage.ConfirmOrder(ConfirmationMessage);
		Assert.assertTrue(TxtConfirm);	
//		Thread.sleep(15000);
	}

	@Test(dependsOnMethods = "SubmitOrder" )
	public void checkOrder() {
		OrderPage orderPage = loginPage.GoToOrderPage();
		 boolean Match = orderPage.OrderDisplay(Productname);
		 Assert.assertTrue(Match);	
		
	}
}
