package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features="classpath:features",
	        glue="stepdefs", 
	        tags="@t4", 
	        plugin = {"pretty",
	            "html:target/html/htmlreport.html",
	            "json:target/json/file.json",
	            },
	        monochrome=true,
	        publish=true,
	        dryRun=false
	        )

	public class TestRunnerTest {

	}
