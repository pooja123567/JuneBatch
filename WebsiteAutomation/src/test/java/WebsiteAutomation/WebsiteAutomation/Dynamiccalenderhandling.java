package WebsiteAutomation.WebsiteAutomation;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamiccalenderhandling {

	public static void main(String[] args) {

		String date = "23";
		String month = "8";
		String year = "2023";
		String expectedlist[] = { month, date, year };
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		// driver.findElement(By.xpath("//abbr[text()='"+month+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		List<WebElement> actuallist = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actuallist.size(); i++) {
			actuallist.get(i).getAttribute("value");
			Assert.assertEquals(actuallist.get(i).getAttribute("value"), expectedlist[i]);
		}
		driver.close();
	}
}
