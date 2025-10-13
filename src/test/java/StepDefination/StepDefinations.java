package StepDefination;

import java.io.IOException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import AbstractComponents.BaseTest;
import MainFW.CartPage;
import MainFW.ConfirmationPage;
import MainFW.LoginPage;
import MainFW.Products;
import MainFW.Shipping;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations extends BaseTest {
	
	String CVV = "123";
	String CardHolder = "Bryan Adams";
	String Country = "India";
	public LoginPage loginpage;
	public Products productCatlogue;
	public ConfirmationPage CNFRMPage;
	public Shipping shipping;
	
	@Given("User landed on the Ecommerce page")
	public void User_landed_on_the_Ecommerce_page() throws IOException
	{
		loginpage = LaunchApp();
	}
	
	@Given("^User Logged in with Email (.+) and Password (.+)$")
	public void User_Logged_in_with_Email_and_Password(String Email, String Password)
	{
		 productCatlogue = loginPage.Login(Email, Password);
	}
	
	@Given("^User add product (.+) in cart$")
	public void User_add_product_in_cart(String Product) {
		productCatlogue.addToCart(Product);
	}
	
	@Given("^Checkout the product (.+) and submit the order$")
	public void Checkout_the_product_and_submit_the_order(String Product)
	{
		CartPage cartPage = productCatlogue.VerifyCartPage();
		boolean Match = cartPage.ProductVerificationCheck(Product);
		AssertJUnit.assertTrue(Match);
		shipping = cartPage.checkOut();
		shipping.ProductVerification(CVV, CardHolder, Country);
		 CNFRMPage = shipping.SubmitOrder();		
	}
	
	@Given ("{string} is displayed on the confirmation page")
	public void OrderCheck(String string) {
		boolean TxtConfirm = CNFRMPage.ConfirmOrder(string);
		Assert.assertTrue(TxtConfirm);	
		driver.close();
	}
	
	@Then ("{string} message is displayed")
	public void Error_Message_Is_Displayed(String string) {
		Assert.assertEquals(string, loginPage.getErrorMsg());
		driver.close();
	}
	

}
