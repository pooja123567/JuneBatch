package WebsiteAutomation.WebsiteAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		//option.setAcceptInsecureCerts(true);
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println("hii");
		//driver.findElement(By.xpath("//button[text()='Back to safety']")).click();
		//driver.findElement(By.xpath("//button[text()='Back to safety']")).click();
		//driver.manage().deleteAllCookies();
//driver.manage().deleteCookieNamed("session-key");
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\Pooja\\screenshot.png"));

		
	}

}
