package WebsiteAutomation.WebsiteAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		SoftAssert a=new SoftAssert();
		//for single link
	//String url	=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	//for every link in a page
		List <WebElement>urls=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	for(WebElement url:	urls)
	{
	String link =url.getAttribute("href");
    HttpURLConnection conn=(HttpURLConnection)new URL(link).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int code=conn.getResponseCode();
	System.out.println(code);
	//example of hard assertion
	//Assert.assertTrue(code<404,"the link with text "+url.getText()+" is broken with code "+code);
	//example of soft assertion
	a.assertTrue(code<404,"the link with text "+url.getText()+" is broken with code "+code);
	
	}
	a.assertAll();
	}
	
	


}
