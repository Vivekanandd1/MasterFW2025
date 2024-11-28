import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginAndLogout {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String name = "unknows";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[contains(@class,'logout')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
