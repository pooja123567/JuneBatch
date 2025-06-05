package WebsiteAutomation.WebsiteAutomation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingUsingStream {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//th[@aria-sort='descending']")).click();
		//List<WebElement>list=driver.findElements(By.xpath("//td[1]"));
	//List<String>originallist=list.stream().map(s->s.getText()).collect(Collectors.toList());
	//List<String>newlist=originallist.stream().sorted().collect(Collectors.toList());
   //Assert.assertTrue(originallist.equals(newlist));
   List<String>price;
   do {
List<WebElement>list=driver.findElements(By.xpath("//td[1]"));
  price=list.stream().filter(x->x.getText().contains("Rice")).map(x->getVegPrice(x)).collect(Collectors.toList());
   price.forEach(x->System.out.println(x));
   if(price.size()<1)
{
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
}
   }while(price.size()<1);
	}

	private static String getVegPrice(WebElement x) {
		
String price=x.findElement(By.xpath("following-sibling::td[1]")).getText();
return price;
	}
	//pagination concept
	

}
