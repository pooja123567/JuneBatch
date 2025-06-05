package WebsiteAutomation.WebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionHandlingInterview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement textfield = driver.findElement(By.id("autocomplete"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='ind';",textfield);
		Thread.sleep(5000);
		textfield.sendKeys(Keys.DOWN);
		textfield.sendKeys(Keys.DOWN);
		textfield.sendKeys(Keys.DOWN);
		String s1=textfield.getAttribute("value");
		System.out.println(s1);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//String s=(String)js.executeScript("return arguments[0].value;",textfield);
		//System.out.println(s);
		
		
	}
}
