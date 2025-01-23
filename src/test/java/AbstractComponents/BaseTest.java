package AbstractComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import MainFW.LoginPage;

public class BaseTest {
	public WebDriver driver;
	public LoginPage loginPage;

	public WebDriver DriverInvoke() throws IOException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Resource.properties");
		props.load(fis);
		String Browser = props.getProperty("BrowserName");
		
		if(Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	@BeforeTest
	public LoginPage LaunchApp() throws IOException {
		driver = DriverInvoke();
		loginPage = new LoginPage(driver);
		loginPage.goTo();
		return loginPage;
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
