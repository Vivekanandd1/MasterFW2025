package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	WebDriver driver;
	
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
	WebElement OrderBtn;
	

	public void ElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));
	}
	
	public void WebElementToAppear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		 wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
	
	public void ElementToDisappear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	
	public void ElementToClick(WebElement Ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		 wait.until(ExpectedConditions.elementToBeClickable(Ele));
	}
	
	public void ScreenScroll(String Command) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Command);
	}
	
	public void MovetoElement(WebElement Ele, String country) {
		Actions Act = new Actions(driver);
		Act.sendKeys(Ele, country).build().perform();
	}
	
	public void MovetoElements(WebElement Ele) {
		Actions Act = new Actions(driver);
		Act.moveToElement(Ele).build().perform();
	}
	public OrderPage GoToOrderPage() {
		MovetoElements(OrderBtn);
		ElementToClick(OrderBtn);
		OrderBtn.click();
		OrderPage orderPage = new OrderPage(driver);
		return orderPage;
	}

}
