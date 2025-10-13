package MainFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class Shipping extends AbstractComponent{
	WebDriver driver;
	
	public Shipping(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement CVVCode;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement CardHolderName;
	
	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement CountryBox;
	
	@FindBy(xpath = "(//button[@type='button'])[2]" )
	WebElement CountryName;
	
	@FindBy(css = "a.action__submit" )
	WebElement SubmitBtn;
//	@FindBy(css = ".ta-results")
//	WebElement ResultBox;
	By ResultBox = By.cssSelector(".ta-results");
	By Submit = By.cssSelector("a.action__submit");
	
	
	public void ProductVerification(String CVV,String CardHolder,String Country) {
		ScreenScroll("window.scrollBy(1049, 564)");
		CVVCode.sendKeys(CVV);
		CardHolderName.sendKeys(CardHolder);
		MovetoElement(CountryBox, Country);
		CountryName.click();

	}
	
	public ConfirmationPage SubmitOrder() {
		ElementToAppear(Submit);
		ElementToClick(SubmitBtn);
		try{JSClick("arguments[0].click", SubmitBtn);}
		finally {
			SubmitBtn.click();
		}
		
		ConfirmationPage CNFRMPage = new ConfirmationPage(driver);
		return CNFRMPage;
	}
	

	
}
