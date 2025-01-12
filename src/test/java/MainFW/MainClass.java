package MainFW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		//Deshmukh@yopmail.com
		//Deshmukh@123
		driver.findElement(By.id("userEmail")).sendKeys("Deshmukh@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Deshmukh@123");
		driver.findElement(By.id("login")).click();
	}

}


