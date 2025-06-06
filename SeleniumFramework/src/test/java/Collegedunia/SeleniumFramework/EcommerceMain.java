package Collegedunia.SeleniumFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceMain {

	public static void main(String[] args) {
		String productname="ZARA COAT 3";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		LoginModule loginmodule=new LoginModule(driver);
		
		loginmodule.getUrl();
		loginmodule.actionLogin();
		
		

	}

}
