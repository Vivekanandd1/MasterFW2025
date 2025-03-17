package BattleField;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsUse {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> Items = driver.findElements(By.xpath("//tr/td[1]"));
		Items.stream().forEach(s->System.out.println(s.getText()));
		List<WebElement> ImprovedList = Items.stream().filter(s->s.getText().contains("Apple")).collect(Collectors.toList());
		
		List<String> price = Items.stream().filter(s->s.getText().contains("Apple")).map(s->ItemPrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
	}
	
	public static String ItemPrice(WebElement s) {
		
		String ActualPrice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return ActualPrice;
	}

}
