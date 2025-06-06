package Collegedunia.SeleniumFramework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	ExtentReports mainreport;
	
@BeforeTest	
public void initConfig()
{
	String src=System.getProperty("user.dir")+"\\report\\index.html";
	System.out.println(src);
	ExtentSparkReporter helpreport=new ExtentSparkReporter(src);
helpreport.config().setReportName("Test Report");
helpreport.config().setDocumentTitle("Report");
mainreport=new ExtentReports();
mainreport.attachReporter(helpreport);
mainreport.setSystemInfo("tester", "Pooja bisht");
	
}
@Test
public void initialDemo()
{
 ExtentTest test=mainreport.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		mainreport.flush();
		
		
	}
	
	
	


}
