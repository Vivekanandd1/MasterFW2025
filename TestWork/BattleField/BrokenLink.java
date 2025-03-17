package BattleField;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			String url = link.getDomProperty("href");
			URI baseUri = new URI(url);
			//Code for below java 20 version
//			HttpURLConnection Conn = (HttpURLConnection) new URL(url).openConnection();
			//Code for above java 20 version[Line 30 to 31]
			URL a = baseUri.toURL();
			HttpURLConnection Conn = (HttpURLConnection) a.openConnection();
			//HEAD: Retrieves the headers of a resource without fetching the entire content
			Conn.setRequestMethod("HEAD");
			Conn.connect();
			int Respcode= Conn.getResponseCode();
			System.out.println("The link " + link.getText() + " Having responsecode as "+ Respcode);
			
			
			//Change the deprecated methods.
		}
	}

}
