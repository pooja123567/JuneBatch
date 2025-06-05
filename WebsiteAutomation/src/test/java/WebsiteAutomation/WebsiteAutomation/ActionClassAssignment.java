package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClassAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windowopen = driver.getWindowHandles();
		Iterator<String> it = windowopen.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		String s = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(s);
		driver.switchTo().window(parentwindow);
		String s1 = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println(s1);
		
	}

}
