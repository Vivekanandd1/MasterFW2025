package AbstractComponents;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr/td[2]")
	List <WebElement> productlist;
	
	
	public boolean OrderDisplay(String ProductName) {
		List<WebElement> OrderProducts = productlist;
		boolean Check = OrderProducts.stream().anyMatch(s -> s.getText().equalsIgnoreCase(ProductName));
		return Check;
	}

	
	
	
}
