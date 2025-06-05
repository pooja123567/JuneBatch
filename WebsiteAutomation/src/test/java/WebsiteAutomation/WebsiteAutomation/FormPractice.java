package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		String s="pankaj";
		driver.findElement(By.name("name")).sendKeys(s);
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("Pankaj@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Pankaj@1234");
		driver.findElement(By.id("exampleCheck1")).click();
		Select se = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		se.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("27-12-2024");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
