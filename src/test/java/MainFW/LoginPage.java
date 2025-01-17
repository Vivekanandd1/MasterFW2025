package MainFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userEmail")
	WebElement EmailEle;
	
	@FindBy(id="userPassword")
	WebElement PasswordEle;
	
	@FindBy(id="login")
	WebElement LoginBtn;
	
	public void Login(String Email,String Password) {
		EmailEle.sendKeys(Email);
		PasswordEle.sendKeys(Password);
		LoginBtn.click();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
