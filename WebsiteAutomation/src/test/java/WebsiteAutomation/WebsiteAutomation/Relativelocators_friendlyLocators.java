package WebsiteAutomation.WebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators_friendlyLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='hii';", name);
		//above
System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
//below
WebElement dateofbirt=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
driver.findElement(with(By.tagName("input")).below(dateofbirt)).click();
//toLeftOf
WebElement checkbox=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
//toRightOf
WebElement radio=driver.findElement(By.xpath("//label[@for='exampleFormControlRadio1']"));
driver.findElement(with(By.tagName("input")).toRightOf(radio)).click();

	}

}
