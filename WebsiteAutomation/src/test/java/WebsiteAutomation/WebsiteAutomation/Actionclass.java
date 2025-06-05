package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// keyboard mouse action handling

		// driver.get("https://collegedunia.com/");
		// driver.manage().window().maximize();
		 Actions a=new Actions(driver);
		// a.moveToElement(driver.findElement(By.xpath("//span[text()='Explore']"))).contextClick().build().perform();
		// a.moveToElement(driver.findElement(By.xpath("//span[text()='Search for
		// Colleges, Exams, Courses and
		// More..']"))).click().keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.xpath("//span[text()='Search
		// for Colleges, Exams, Courses and
		// More..']")),"jee").doubleClick().build().perform();
		 
		

		// child window handling
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		String s = driver.findElement(By.cssSelector("[class='im-para red']")).getText();
		String username = s.split("at")[1].trim().split(" ")[0];
		System.out.print(username);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(username);
	

	}

}
