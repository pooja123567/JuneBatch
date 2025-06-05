package WebsiteAutomation.WebsiteAutomation;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SetUpSelenium {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
      String Password=extractPassword(driver);
   //  System.out.println( driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS));
   //driver.findElement(By.cssSelector("div[class='login-btn']:nth-child(2)")).click();
   //driver.findElement(By.id("inputUsername")).sendKeys("pooja");
  // driver.findElement(By.name("inputPassword")).sendKeys("Poojabisht@123");
 //  driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
  // System.out.println(driver.findElement(By.className("error")).getText());
  // driver.findElement(By.linkText("Forgot your password?")).click();
 //  driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("pooja");
  // driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pujabisht.789@gmail.com");
 //  driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8650847256");
 // Thread.sleep(1000);
  //driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
 driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
  driver.findElement(By.id("inputUsername")).sendKeys("pooja");
  driver.findElement(By.name("inputPassword")).sendKeys(Password);
  Thread.sleep(1000);
 driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
  Thread.sleep(1000);
 driver.findElement(By.tagName("p")).getText();
  Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
  driver.findElement(By.xpath("//*[text()='Log Out']")).click();
  
  
 
   //driver.findElement(By.id("otp-login-btn")).click();
  
  // driver.findElement(By.xpath("//button[@class=\"Blvn9 CB4ZG\"]")).click();

   
	}
	
	public static String extractPassword(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String s=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	String[]s1=s.split("'");
	String s2=s1[1];
	System.out.println(s2);
	return s2;

		
		
	}
	
	
	

}