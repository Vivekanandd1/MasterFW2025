package BattleField;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Deleted {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String[] itemsNeeded = {"Brocolli", "Cucumber"};
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        int j = 0;
        for (WebElement product : products) {
            String[] name = product.getText().split("-");
            String formattedName = name[0].trim();
            if (itemsNeededList.contains(formattedName)) {
                System.out.println(formattedName);
                j++;
//                var xpathFormat = "//h4[contains(text(),'%s')" +
//                        "]/following-sibling::div[@class='product-action']/button";
//                var elementToBeClicked = driver.findElement(By.xpath(String.format(xpathFormat, formattedName)));
//                elementToBeClicked.click();
                if (j == 2) {
                    break;
                }
            }
        }

//        Thread.sleep(2000);
//        driver.quit();

    }

}
