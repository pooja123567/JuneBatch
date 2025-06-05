package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase("india")){
				list.get(i).click();
			break;
			
		
		
			
}
		

		}

	}

}
