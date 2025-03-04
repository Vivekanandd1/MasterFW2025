package BattleField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(2000);
		System.out.println( driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isEnabled());
		System.out.println( driver.findElement(By.xpath("//div[text()='Students']")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
	}

}
