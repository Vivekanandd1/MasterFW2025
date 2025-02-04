package MainFW;

import org.testng.annotations.Test;

import AbstractComponents.BaseTest;
import TestComponent.iRetryAnalyzer;

import org.testng.Assert;
import java.io.IOException;


public class ErrorValidation extends BaseTest{

	
	@Test(groups = "ErroHandling",retryAnalyzer = iRetryAnalyzer.class)
	public void LoginErrorCheck() {
		
		loginPage.Login("Deshmukh@yopmail.com", "Deshmukh@133");
		Assert.assertEquals("Incorrect email  password.", loginPage.getErrorMsg());
	
	}
	
	@Test
	public void ProductValidation() throws InterruptedException, IOException {
		String Productname = "IPHONE 13 PRO";
		Products productCatlogue = loginPage.Login("Deshmukh@yopmail.com", "Deshmukh@123");
		productCatlogue.addToCart(Productname);
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck("IPHONE 15 PRO");
		Assert.assertFalse(Match);
	}
	
	
}
