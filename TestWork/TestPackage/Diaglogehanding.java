package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Diaglogehanding {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		opt.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("Deshmukh@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Deshmukh@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/myorders']")).click();
		}

}
