package MainFW;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainClass {

	public static void main(String[] args) {
		String Productname = "IPHONE 13 PRO";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		// Deshmukh@yopmail.com
		// Deshmukh@123
		driver.findElement(By.id("userEmail")).sendKeys("Deshmukh@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Deshmukh@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> Products = driver.findElements(By.cssSelector(".mb-3"));
//		WebElement Products = driver.findElement(By.cssSelector(".mb-3"));
//		List<WebElement> Text = Products.findElements(By.cssSelector("b"));
//		Text.stream().forEach(s->System.out.println(s.getText()));

		WebElement MyProduct = Products.stream()
				.filter(Product -> Product.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst()
				.orElseGet(null);
		MyProduct.findElement(By.cssSelector("button.w-10")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#toast-container"))));
		WebElement CartBtn = driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']"));
		wait.until(ExpectedConditions.elementToBeClickable(CartBtn));
		CartBtn.click();
		List<WebElement> CartsProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		boolean Check = CartsProducts.stream().anyMatch(s -> s.getText().equalsIgnoreCase(Productname));
		Assert.assertTrue(Check);
		WebElement CheckoutBtn = driver.findElement(By.cssSelector(".totalRow button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,400)");
		wait.until(ExpectedConditions.elementToBeClickable(CheckoutBtn));
		CheckoutBtn.click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bryan Adams");
		Actions Act = new Actions(driver);
		Act.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));	
			
		//driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("india");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
	}

}
