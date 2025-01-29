package MainFW;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

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
	public void SubmitOrder(HashMap<String, String> input) throws InterruptedException, IOException {		
		Products productCatlogue = loginPage.Login(input.get("Email"),input.get("Password"));
		productCatlogue.addToCart(input.get("Product"));
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck(input.get("Product"));
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
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Email", "Deshmukh@yopmail.com");
		map.put("Password", "Deshmukh@123");
		map.put("Product", "BANARSI SAREE");
		
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("Email", "Shivam@yopmail.com");
		map1.put("Password", "Shivam@123");
		map1.put("Product", "IPHONE 13 PRO");
		return new Object[][]{{map},{map1}}  ;
		
//		return new Object[][] {{"Deshmukh@yopmail.com", "Deshmukh@123","BANARSI SAREE"},{"Shivam@yopmail.com","Shivam@123","IPHONE 13 PRO"}};
		
	}
}
