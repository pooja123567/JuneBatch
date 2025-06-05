package WebsiteAutomation.WebsiteAutomation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSearchingUsingStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	    driver.findElement(By.id("search-field")).sendKeys("Rice");
	   List<WebElement>originallist= driver.findElements(By.cssSelector("td:nth-child(1)"));
	  List<WebElement>newlist= originallist.stream().filter(x->x.getText().contains("Rice")).collect(Collectors.toList());
	  Assert.assertEquals(originallist.size(),newlist.size());
	}


}
