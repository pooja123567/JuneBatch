package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThreeMethodOneClass {
	
	@AfterClass
	public void afterClass()
	{
	System.out.println("after class");	
	}

@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	@AfterMethod
	public void afterMethod()
	{
	System.out.println("after method")	;
	}
	
	@Test
	public void loginApp()
	{
	System.out.println("login through app")	;
	}
	@Test
	public void loginWebsite()
	{
		System.out.println("login through website");
	}
	@Test
	public void loginApi()
	{
		System.out.println("login through api");
	
	}
	
	@Test
	public void autoLogin()
	{
		System.out.println("auto login");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("before method")	;
	}
	@Test
	public void data1() {
		
		System.out.println("method 1 to check before method");
		
	}
	@Test
public void data2() {
		
		System.out.println("method 2 to check before method");
		
	}
	@BeforeClass
	public void beforeClass()
	{
	System.out.println("Before class");	
	}
	
	@Test(groups={"groupData"})
	public void groupData1()
	{
		System.out.println("group data 1");
	}
	@Test(groups={"groupData"})
	public void groupData2()
	{
		System.out.println("group data 2");	
	}
	@Test(groups= {"groupData"})
	public void groupData3()
	{
		System.out.println("group data 3");
	}
}
