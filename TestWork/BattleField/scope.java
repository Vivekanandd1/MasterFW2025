package BattleField;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class scope {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		
		WebElement Column = Footerdriver.findElement(By.xpath("//table//tr/td[1]/ul"));
		System.out.println(Column.findElements(By.tagName("a")).size());
		
		for(int i=0;i<Column.findElements(By.tagName("a")).size();i++) {
			//Different approach to click on the links
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", Column.findElements(By.tagName("a")).get(i));
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.elementToBeClickable(Column.findElements(By.tagName("a")).get(i)));
			String Click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Column.findElements(By.tagName("a")).get(i).sendKeys(Click);
			
			}
		
		Set<String> It=driver.getWindowHandles();
		Iterator<String> ABC = It.iterator();
		while (ABC.hasNext()) {
			driver.switchTo().window(ABC.next());
			System.out.println(driver.getTitle());
			
			
		}
		
		
		
	}
      
}
