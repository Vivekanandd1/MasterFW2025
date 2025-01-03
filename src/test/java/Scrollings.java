import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollings {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[4]"));
		int sum=0;
		for (int i=0;i<values.size();i++) {
			
			String value = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[4]")).get(i).getText();
			int value1 = Integer.parseInt(value);
			System.out.println("value is "+ value1);
			sum =sum +value1;
			
		}
		
		System.out.println("sum is = " + sum);
	}

}
