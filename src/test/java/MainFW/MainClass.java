package MainFW;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		//Deshmukh@yopmail.com
		//Deshmukh@123
		driver.findElement(By.id("userEmail")).sendKeys("Deshmukh@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Deshmukh@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> Products = driver.findElements(By.cssSelector(".mb-3"));
//		WebElement Products = driver.findElement(By.cssSelector(".mb-3"));
//		List<WebElement> Text = Products.findElements(By.cssSelector("b"));
//		Text.stream().forEach(s->System.out.println(s.getText()));
		
		WebElement MyProduct = Products.stream().filter(Product->Product.findElement(By.cssSelector("b")).getText().
				equals("IPHONE 13 PRO")).findFirst().orElseGet(null);
		MyProduct.findElement(By.cssSelector("button.w-10")).click();
	}

}


