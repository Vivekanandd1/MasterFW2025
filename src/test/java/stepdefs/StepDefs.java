package stepdefs;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.CmnPageObjects;
import pageobjectmodel.TwitterPgObj;

public class StepDefs
{
	 private static final Logger logger = LogManager.getLogger(StepDefs.class);
	 
	 WebDriver driver;
	    String base_url = "https://automationpractice.com";
	    int implicit_wait_timeout_in_sec = 20;
	    Scenario scn; 
	    
	    CmnPageObjects cmnPageObjects;
	    
	    TwitterPgObj  twitterPgObj;
	    
 
	   	 @Before
	    	public void setUp(Scenario scn) throws Exception{
	   		    this.scn=scn;
	   		     String browserName = WebDriverFactory.getBrowserName();
	   		    driver = WebDriverFactory.getWebDriverForBrowser(browserName);
	   	        scn.log("Browser Invoked");
	   	        logger.info("Browser invoked.");
	  
	        cmnPageObjects = new CmnPageObjects(driver,scn);
	        twitterPgObj = new TwitterPgObj(driver,scn);  
	   	 }


         @After(order=1)
           public void cleanUp(){
             WebDriverFactory.quitDriver();
             scn.log("Browser Closed");
}
         
         @After(order=2)
         public void takeScreenShot(Scenario s) {
             if (s.isFailed()) {
                 TakesScreenshot scrnShot = (TakesScreenshot)driver;
                 byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
                 scn.attach(data, "image/png","Failed Step Name: " + s.getName());
             }else{
                 scn.log("Test case is passed, no screen shot captured");
             }
         }
         
//--User navigated to the home application url--
         
@Given("User navigated to the home application url")
public void User_navigated_to_the_home_application_url() {
    WebDriverFactory.navigateToTheUrl(base_url);
    scn.log("Browser navigated to URL: " + base_url);
    logger.info("Browser navigated to URL: " + base_url);
}

//--User validate to the home  page application url--
//user validate application home page url
@When("user validate application home page url")
public void user_validate_application_home_page_url() {
    String expected="My Store";
    cmnPageObjects.validatePageTitleMatch(expected);
}
//--User should be redirect to"https//automationpractice.com/index.php"


@Then("User should be redirected to {string}")
public void user_should_be_redirected_to(String expected_url) {
	 cmnPageObjects.PageRedirection(expected_url);
}
//--User validate  application logo visibility--
@When("User validate application logo visibility")
public void user_validate_application_logo_visibility() {
	cmnPageObjects.validateAppLogo();
	 scn.log("logo is validated");
}

//--user validate height and width of logo "99" and "350"--

@Then("User validate Height & Width of logo {string} and {string}")
public void user_validate_height_width_of_logo_and(String Height, String Width) {
	cmnPageObjects.assertingLogoSize(Height, Width);
}
//--user fetch product category list--

	@When("user fetch product category list")
	public void user_fetch_product_category_list(io.cucumber.datatable.DataTable dataTable) {
		cmnPageObjects.CategoriesOfProduct();
	}

//--User validate count of the product categories should be "3"--

	@Then("User validate count of the product categories should be {string}")
	public void user_validate_count_of_the_product_categories_should_be(String Count) {
		cmnPageObjects.CountOfProductCategories();
	}

//--User entered text in searchbox "T-shirt"--		

	@When("User entered text in searchbox {string}")
	public void user_entered_text_in_searchbox(String productName) {
		cmnPageObjects.SetSearchTextBox(productName);
	}

//--User validate autosuggestion text "T-shirts > Faded Short Sleeve T-shirts"--		

	@Then("User validate autosuggestion text {string}")
	public void user_validate_autosuggestion_text(String productname) {
		cmnPageObjects.ValidateAutosuggestionText(productname);

	}

//--User clicked on twitter logo--		

	@When("User clicked on twitter logo")
	public void user_clicked_on_twitter_logo() {
	   twitterPgObj.SocialMediaHandle();
	}

//--User Validate the url opened on a new tab contains "selenium"--	

	@When("User Validate the url opened on a new tab contains {string}")
	public void user_validate_the_url_opened_on_a_new_tab_contains(String expectedTitle) throws InterruptedException {

		twitterPgObj.validateTwitterPageTitle(expectedTitle);
  }

//--Validate the twitter account name is "Selenium Framework"--	

	@Then("Validate the twiiter accont name is {string}")
	public void validate_the_twiiter_accont_name_is(String TwitterAccName) throws InterruptedException {

		    twitterPgObj.SocialMediaHandleName(TwitterAccName);
	}

}