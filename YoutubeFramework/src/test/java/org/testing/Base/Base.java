package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	public Properties pr;
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		File f=new File("../YoutubeFramework/ObjectRepo.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	
	
	

}


