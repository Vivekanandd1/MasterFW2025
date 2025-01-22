package MainFW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".cartSection h3")
	List<WebElement> ProductsInCart;
	
	@FindBy(css=".totalRow button")
	WebElement CheckoutBtn;
	
	
	
	
	public boolean ProductVerification(String ProductName) {
		List<WebElement> CartsProducts = ProductsInCart;
		boolean Check = CartsProducts.stream().anyMatch(s -> s.getText().equalsIgnoreCase(ProductName));
		return Check;
	}
	
	public Shipping checkOut() {
		ScreenScroll("window.scroll(0,400)");
		ElementToClick(CheckoutBtn);
		CheckoutBtn.click();
		Shipping shipping = new Shipping(driver);
		return shipping;
	}
	
	
}
