package Collegedunia.SeleniumFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ECommerce {

	public static void main(String[] args) throws InterruptedException {
		String productname="ZARA COAT 3";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("userEmail")).sendKeys("jjjkkk@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Pooja@123");
		driver.findElement(By.id("login")).click();
	List<WebElement>products=driver.findElements(By.xpath("//div[@class='card-body']/h5/b"));
	//System.out.println(products.size());
	for(int i=0;i<products.size();i++)
	{
	String Product=	products.get(i).getText();
	if(Product.equalsIgnoreCase(productname))
	{
		driver.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
	}
	}
	//Thread.sleep(5000);
Wait w=new WebDriverWait(driver, Duration.ofSeconds(5));
w.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	 driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();	
	List<WebElement>cartitem =driver.findElements(By.cssSelector("div[class='cartSection'] h3"));
boolean value=cartitem.stream().anyMatch(x->x.getText().equalsIgnoreCase(productname));
Assert.assertTrue(value);
driver.findElement(By.xpath("//button[text()='Checkout']")).click();
WebElement textfield=driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
textfield.sendKeys("ind");

List<WebElement>autosuggestion=driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
for(int i=0;i<autosuggestion.size();i++) {
	if(autosuggestion.get(i).getText().equalsIgnoreCase("india"))
	{
		autosuggestion.get(i).click();
		break;
	}
}
Thread.sleep(1000);
driver.findElement(By.cssSelector("div[class='actions'] a")).click();
String s=driver.findElement(By.xpath("//h1")).getText();
System.out.println(s);
Assert.assertTrue(s.equals("THANKYOU FOR THE ORDER."));





}
}
