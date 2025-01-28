package MainFW;

import org.testng.annotations.DataProvider;
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
	
	String ProductName= "IPHONE 13 PRO";
	String CVV = "123";
	String CardHolder = "Bryan Adams";
	String Country = "India";
	String ConfirmationMessage = "Thankyou for the order.";

	//(dataProvider = "getData",groups = "purchase")
	//String Email,String Password, String Productname
	@Test(dataProvider = "getData",groups = {"purchase"})
	public void SubmitOrder(String Email,String Password, String Productname) throws InterruptedException, IOException {		
		Products productCatlogue = loginPage.Login(Email,Password);
		productCatlogue.addToCart(Productname);
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck(Productname);
		AssertJUnit.assertTrue(Match);
		Shipping shipping =cartPage.checkOut();
		shipping.ProductVerification(CVV, CardHolder, Country);
		ConfirmationPage CNFRMPage = shipping.SubmitOrder();
		boolean TxtConfirm = CNFRMPage.ConfirmOrder(ConfirmationMessage);
		Assert.assertTrue(TxtConfirm);	
//		tearDown();
	}

	@Test(dependsOnMethods = "SubmitOrder" )
	public void checkOrder() {
		OrderPage orderPage = loginPage.GoToOrderPage();
		 boolean Match = orderPage.OrderDisplay(ProductName);
		 Assert.assertTrue(Match);	
		
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"Deshmukh@yopmail.com", "Deshmukh@123","BANARSI SAREE"},{"Shivam@yopmail.com","Shivam@123","IPHONE 13 PRO"}};
		
	}
}
