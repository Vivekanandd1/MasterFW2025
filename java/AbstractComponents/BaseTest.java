package AbstractComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import MainFW.LoginPage;

public class BaseTest {
	public WebDriver driver;
	public LoginPage loginPage;

	public WebDriver DriverInvoke() throws IOException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Resource.properties");
		props.load(fis);
		String Browser = System.getProperty("browser")!=null ? System.getProperty("browser") :props.getProperty("browser");
		
		if(Browser.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			if (Browser.contains("headless")) {
				options.addArguments("headless");
				
			}
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1400,900));
			
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
	
	@BeforeMethod(alwaysRun = true)
	public LoginPage LaunchApp() throws IOException {
		driver = DriverInvoke();
		loginPage = new LoginPage(driver);
		loginPage.goTo();
		return loginPage;
	}
	
	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
	{
		//read json to string
	String jsonContent = 	FileUtils.readFileToString(new File(filePath), 
			StandardCharsets.UTF_8);
	
	//String to HashMap- Jackson Databind
	
	ObjectMapper mapper = new ObjectMapper();
	  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
      });
	  return data;


	}
	
	public String getScreenshot(String TestCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//report//"+TestCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//report//"+TestCaseName+".png";
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.close();
	}

}
