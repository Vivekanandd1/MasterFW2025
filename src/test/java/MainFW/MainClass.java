package MainFW;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import AbstractComponents.BaseTest;
import AbstractComponents.OrderPage;
import TestComponent.iRetryAnalyzer;

public class MainClass extends BaseTest {
	
	String ProductsName= "ADIDAS ORIGINAL";
	String CVV = "123";
	String CardHolder = "Bryan Adams";
	String Country = "India";
	String ConfirmationMessage = "Thankyou for the order.";

	@Test(dataProvider = "getData",groups = {"purchase"})
	public void SubmitOrder(HashMap<String, String> input) throws InterruptedException, IOException {		
		Products productCatlogue = loginPage.Login(input.get("Email"),input.get("Password"));
		productCatlogue.addToCart(input.get("Product"));
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck(input.get("Product"));
		Assert.assertTrue(Match);
		Shipping shipping =cartPage.checkOut();
		shipping.ProductVerification(CVV, CardHolder, Country);
		ConfirmationPage CNFRMPage = shipping.SubmitOrder();
		boolean TxtConfirm = CNFRMPage.ConfirmOrder(ConfirmationMessage);
		System.out.println("Order id is: " + driver.findElement(By.xpath("//tr/td/label[@class='ng-star-inserted']")).getText());
		Assert.assertTrue(TxtConfirm);
	}

	@Test(dependsOnMethods = "SubmitOrder",retryAnalyzer=iRetryAnalyzer.class ) 
	public void checkOrder() {
		Products productCatlogue = loginPage.Login("Deshmukh@yopmail.com", "Deshmukh@123");
		OrderPage ordersPage = productCatlogue.GoToOrderPage();
		Assert.assertTrue(ordersPage.OrderDisplay(ProductsName));
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\Data\\PurchaseOrder.json");
		return new Object[][]{{data.get(0)},{data.get(1)}}  ;
	}
}
