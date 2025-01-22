package MainFW;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		String Productname = "IPHONE 13 PRO";
		String CVV = "123";
		String CardHolder = "Bryan Adams";
		String Country = "India";
		String ConfirmationMessage = "Thankyou for the order.";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage loginPage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage.goTo();
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
		Thread.sleep(4000);
		driver.quit();
	}

}
