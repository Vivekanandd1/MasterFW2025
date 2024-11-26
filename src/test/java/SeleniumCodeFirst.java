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
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Daryl Dixon");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Damys@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("daryl@yopmail.com");
	}

}
