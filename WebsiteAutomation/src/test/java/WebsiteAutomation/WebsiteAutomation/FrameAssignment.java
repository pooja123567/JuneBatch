package WebsiteAutomation.WebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(0);
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		//driver.switchTo().frame(4);
		driver.switchTo().frame("frame-middle");
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
	System.out.println(driver.findElement(By.id("content")).getText());
	
	}

}
