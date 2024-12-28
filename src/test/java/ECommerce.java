import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] itemsNeeded = { "Brocolli", "Cucumber" };
		ECommerce E = new ECommerce();
		E.AddItem(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}
	
	public void AddItem(WebDriver driver,String[] itemsNeeded ) throws InterruptedException {
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < Products.size(); i++) {

			String[] Name = Products.get(i).getText().split("-");
			String FormatedName = Name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			int j = 0;
			if (itemsNeededList.contains(FormatedName)) {
				System.out.println(FormatedName);
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(5000);
				if (j==2) {
					break;
				}

			}
		}

		
	}

}
