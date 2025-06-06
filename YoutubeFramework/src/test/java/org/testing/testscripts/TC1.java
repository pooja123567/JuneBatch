package org.testing.testscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC1 extends Base{
	

	@Test
	public void tc1() throws InterruptedException
	{

	WebElement loginbutton=driver.findElement(By.xpath(pr.getProperty("loginbutton")));
	loginbutton.click();
	WebElement EmailId=driver.findElement(By.xpath(pr.getProperty("EmailId")));
	EmailId.sendKeys("purtesting934");
	Thread.sleep(5000);
	WebElement nextButton=driver.findElement(By.xpath(pr.getProperty("nextButton")));
	nextButton.click();
	Thread.sleep(5000);
	WebElement Password=driver.findElement(By.xpath(pr.getProperty("Password")));
	System.out.print("Hello2");
	Password.sendKeys("Rem@rk@ble123");
	WebElement nextbutton1=	driver.findElement(By.xpath(pr.getProperty("nextButton")));
	nextbutton1.click();
	Thread.sleep(5000);
	WebElement Trendingbutton=driver.findElement(By.xpath(pr.getProperty("Trendingbutton")));
	Trendingbutton.click();
	WebElement image=driver.findElement(By.xpath(pr.getProperty("image")));
	image.click();
	Thread.sleep(5000);
	WebElement switchaccount=driver.findElement(By.xpath(pr.getProperty("switchaccount")));
	switchaccount.click();
	Thread.sleep(5000);
	WebElement logout=driver.findElement(By.xpath(pr.getProperty("logout")));
	logout.click();
	
	
		}
}
