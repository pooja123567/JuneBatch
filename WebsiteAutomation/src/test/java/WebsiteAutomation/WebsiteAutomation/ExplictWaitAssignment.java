package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Wait w = new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("[value='user']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("[data-style='btn-info']")).click();
		driver.findElement(By.xpath("//option[text()='Consultant']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
		int size = driver.findElements(By.xpath("//button[@class='btn btn-info']")).size();
		for (int i = 0; i < size; i++) {
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		driver.findElement(By.cssSelector("[class=\"nav-link btn btn-primary\"]")).click();

	}

}
