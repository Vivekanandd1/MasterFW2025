import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			HttpURLConnection Conn = (HttpURLConnection) new URL(url).openConnection();
			Conn.setRequestMethod("HEAD");
			Conn.connect();
			int Respcode= Conn.getResponseCode();
			System.out.println("The link " + link.getText() + " Having responsecoed as "+ Respcode);
			
		}
	}

}
