import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumCodeFirst {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("unknows");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("unknows");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
