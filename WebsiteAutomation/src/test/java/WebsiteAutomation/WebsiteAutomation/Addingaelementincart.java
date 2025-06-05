package WebsiteAutomation.WebsiteAutomation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingaelementincart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Wait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		String addToCartItem[] = { "Cauliflower", "Tomato", "Brinjal" };
		List<String> l = Arrays.asList(addToCartItem);
		List<WebElement> itemNeeded = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int loopcount = 0;
		for (int i = 0; i < itemNeeded.size(); i++) {
			String s = itemNeeded.get(i).getText();
			String[] s1 = s.split("-");
			String s2 = s1[0].trim();
			if (l.contains(s2)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				loopcount++;
				if (loopcount == 3) {
					break;
				}
			}

		}
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("[class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='promoInfo']")));
		boolean d=driver.findElement(By.cssSelector("[class='promoInfo']")).isDisplayed();
		System.out.println(d);
	}

}
