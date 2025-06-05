package WebsiteAutomation.WebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToWebElementAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int noofcolumns = driver.findElements(By.cssSelector("table[name='courses'] th")).size();
		System.out.println(noofcolumns);
		int noofrows = driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
		System.out.println(noofrows);
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());

	}

}
