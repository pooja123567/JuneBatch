package WebsiteAutomation.WebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDataAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
String s1=driver.findElement(By.cssSelector("label[for='honda'] ")).getText();
driver.findElement(By.id("dropdown-class-example")).sendKeys(s1);
driver.findElement(By.id("name")).sendKeys(s1);
driver.findElement(By.id("alertbtn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();


	}

}
