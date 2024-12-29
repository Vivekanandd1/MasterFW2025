import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitches {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'ResumeAssistance')]")).click();
		Set<String> Window = driver.getWindowHandles();
		Iterator<String>it=Window.iterator();
		String Parentwindow = it.next();
		System.out.println(Parentwindow);
		String childwindow = it.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		String Usernamme = driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText();
		System.out.println(Usernamme);
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.id("username")).sendKeys(Usernamme);
	}

}
