package AbstractClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ResusableCode {
	WebDriver driver;
	
	public ResusableCode(WebDriver driver) {
		this.driver=driver;
		
	}

	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		System.out.println("1");
	}
	

}
