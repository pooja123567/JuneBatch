package Collegedunia.SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.ResusableCode;

public class LoginModule extends ResusableCode {
	
	WebDriver driver;
	public LoginModule(WebDriver driver)
	{
		super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="userEmail")
	  WebElement useremail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	public void actionLogin() {
		implicitwait();
		useremail.sendKeys("jjjkkk@gmail.com");
		password.sendKeys("Pooja@123");
		login.click();
		System.out.print("hii");
		
	}
	public void getUrl()
	{
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}

}
