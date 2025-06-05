package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass1 {
	
	 WebDriver driver;
	
	
	public  void mainMethod()
	{
	driver.findElement(By.id("APjFqb")).sendKeys("mobile");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
@AfterMethod	
public void afterMethod() throws InterruptedException
{
	Thread.sleep(5000);
	driver.close();
}
}
