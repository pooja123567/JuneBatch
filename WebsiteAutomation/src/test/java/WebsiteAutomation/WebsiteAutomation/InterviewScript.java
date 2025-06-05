package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://auction.hiring.kgportal.com/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username-field")).sendKeys("user@example.com");
	driver.findElement(By.id("password-field")).sendKeys("cAcJrnkDXsHRncF9qHcm");
driver.findElement(By.cssSelector(".buttonlink_button--large__ZHhmF")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
driver.findElement(By.xpath("//h3[text()=' lefk']")).click();
driver.findElement(By.xpath("//p[text()='Manage']")).click();
driver.findElements(By.xpath("//a[@class=\"actionsMenu_actions-menu__icon-container__ILzfl\"]")).get(0).click();
driver.findElements(By.cssSelector(".actionsMenu_actions-menu__action__-BHbQ")).get(0).click();
driver.findElement(By.id("name")).sendKeys("riya");
driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
}
