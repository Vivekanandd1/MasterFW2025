package BattleField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(1000);
		for (int i=0; i<5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2024']//div//div[text()='11']")).click();
	
	}

}
