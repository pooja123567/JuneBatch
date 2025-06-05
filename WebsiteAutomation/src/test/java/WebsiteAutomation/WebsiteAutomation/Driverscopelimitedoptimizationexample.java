package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverscopelimitedoptimizationexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		/*System.out.println(driver.findElements(By.tagName("a")).size());
        // limting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// limiting webdriver scope
		WebElement firstcoulmnlink = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstcoulmnlink.findElements(By.tagName("a")).size());
		int Elementlength = firstcoulmnlink.findElements(By.tagName("a")).size();
		String clickactivity = Keys.chord(Keys.CONTROL, Keys.ENTER);
		System.out.println(Elementlength);
		for (int i = 0; i < Elementlength; i++) {
			firstcoulmnlink.findElements(By.tagName("a")).get(i).sendKeys(clickactivity);
			Thread.sleep(5000);
		}
		Set<String> windowopen = driver.getWindowHandles();
		Iterator<String> it = windowopen.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	     driver.quit();*/
	WebElement base=driver.findElement(By.xpath("//div[@id='gf-BIG']//ul[1]"));
int size=base.findElements(By.tagName("a")).size();
String data=Keys.chord(Keys.CONTROL,Keys.ENTER);



		
	}
}
