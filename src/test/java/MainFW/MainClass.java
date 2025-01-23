package MainFW;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import AbstractComponents.BaseTest;

public class MainClass extends BaseTest {

	
	@Test
	public void SubmitOrder() throws InterruptedException, IOException {
		String Productname = "IPHONE 13 PRO";
		String CVV = "123";
		String CardHolder = "Bryan Adams";
		String Country = "India";
		String ConfirmationMessage = "Thankyou for the order.";
		Products productCatlogue = loginPage.Login("Deshmukh@yopmail.com", "Deshmukh@123");
		productCatlogue.addToCart(Productname);
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerification(Productname);
		Assert.assertTrue(Match);
		Shipping shipping =cartPage.checkOut();
		shipping.ProductVerification(CVV, CardHolder, Country);
		ConfirmationPage CNFRMPage = shipping.SubmitOrder();
		boolean TxtConfirm = CNFRMPage.ConfirmOrder(ConfirmationMessage);
		Assert.assertTrue(TxtConfirm);	
	}

}
