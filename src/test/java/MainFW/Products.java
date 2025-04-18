package MainFW;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AbstractComponents.AbstractComponent;

public class Products extends AbstractComponent{
	WebDriver driver;
	
	public Products(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".mb-3")
	List<WebElement> Products;
	
	By ProductList = By.cssSelector(".mb-3");
	By ActualProduct = By.cssSelector("button.w-10");
	By Spinner = By.cssSelector("#toast-container");
	By CartBtn = By.xpath("//button[@routerlink='/dashboard/cart']");
	
	
	public List<WebElement> getProductlist() {
		ElementToAppear(ProductList);
		return Products;
	}
	
	public WebElement GetProductByName(String Productname) {
		WebElement MyProduct = getProductlist().stream()
				.filter(Product -> Product.findElement(By.cssSelector("h5 b")).getText().equals(Productname)).findFirst()
				.orElseGet(null);
		return MyProduct;
	}
	
	public void addToCart(String Productname) {
		WebElement AddToCartBtn = GetProductByName(Productname).findElement(ActualProduct);
		ElementToClick(driver.findElement(ActualProduct));
		AddToCartBtn.click();
	}
	
	public CartPage VerifyCartPage() {
		ElementToAppear(Spinner);
		ElementToDisappear(Spinner);
		ElementToAppear(CartBtn);
		ElementToClick(driver.findElement(CartBtn));
		driver.findElement(CartBtn).click();
		CartPage cartPage = new CartPage(driver);
		return cartPage;
	}
}
