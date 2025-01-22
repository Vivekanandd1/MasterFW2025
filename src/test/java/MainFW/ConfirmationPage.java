package MainFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1.hero-primary" )
	WebElement ConfirmText;
	
	public boolean ConfirmOrder(String ExpectedText) {
		ScreenScroll("window.scrollBy(0,0)");
		boolean ActualText = ConfirmText.getText().equalsIgnoreCase(ExpectedText);
		return ActualText;
	}

}
