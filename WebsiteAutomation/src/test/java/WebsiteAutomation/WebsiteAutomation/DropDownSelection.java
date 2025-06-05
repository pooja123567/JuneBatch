
package WebsiteAutomation.WebsiteAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		//dropdown with select tag
		Select se=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
        se.selectByIndex(2);
    String dropdownoption= se.getFirstSelectedOption().getText();
    System.out.println(dropdownoption);
		//driver.findElement(By.xpath("//option[text()=\"AED\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
		Thread.sleep(1000);
	      for(int i=0;i<=8;i++)
	{
	    	  if(i<=7)
	    	  {
	    		  driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
	    		 
	    	  }
	      else
	      {
	    	  driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
    		 
    		}
	    	  
	      }
	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
	Thread.sleep(1000);
	List<WebElement>options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option:options)
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
	option.click();
		}
		
	}
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Adampur (AIP)']")).click();
	Thread.sleep(1000);
	//With index not a good approach
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	//parent child relationship
	//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Bhopal (BHO)']")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	//driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).click();
	//driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active ui-state-hover']")).click();
	//System.out.println(driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active ui-state-hover']")).isSelected());
 //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()+" Hey");
driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()+" Hello");
//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
}
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


	}
}
