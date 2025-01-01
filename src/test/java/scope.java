import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scope {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		
		WebElement Column = Footerdriver.findElement(By.xpath("//table//tr/td[1]/ul"));
		System.out.println(Column.findElements(By.tagName("a")).size());
	}

}
