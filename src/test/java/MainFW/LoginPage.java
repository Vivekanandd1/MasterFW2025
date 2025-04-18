package MainFW;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userEmail")
	WebElement EmailEle;
	
	@FindBy(id="userPassword")
	WebElement PasswordEle;
	
	@FindBy(id="login")
	WebElement LoginBtn;
	
	@FindBy(css="div.toast-message")
	WebElement ErrorMsg;
	
	public Products Login(String Email,String Password) {
		WebElementToAppear(EmailEle);
		EmailEle.sendKeys(Email);
		PasswordEle.sendKeys(Password);
		LoginBtn.click();
		Products productCatlogue = new Products(driver);
		return productCatlogue;
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	public String getErrorMsg() {
		WebElementToAppear(ErrorMsg);
		 return ErrorMsg.getText();
		}
	
}
