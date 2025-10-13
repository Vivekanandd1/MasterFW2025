package MainFW;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//div[@aria-label='Product Added To Cart']")
	WebElement Alerts;
	By Alert = By.xpath("//div[@aria-label='Product Added To Cart']");
	
	
	
	
	public boolean ProductVerificationCheck(String ProductName) {
		List<WebElement> CartsProducts = ProductsInCart;
		boolean Check = CartsProducts.stream().anyMatch(s -> s.getText().equalsIgnoreCase(ProductName));
		return Check;
	}
	
	public Shipping checkOut() {
		//ElementToDisappear(Alert);
		
		ScreenScroll("window.scrollBy(0,600)");
		ElementToClick(CheckoutBtn);
		try{JSClick("arguments[0].click", CheckoutBtn);}
		finally {
			CheckoutBtn.click();
		}
		return new Shipping(driver);
		
	}
	
	
}
