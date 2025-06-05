package Testng;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestng implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
	   System.out.println("fail data ");
	   System.out.println(result.getName());
	   
	  }
	public void onTestSuccess(ITestResult result) {
	   System.out.println("test success");
	  }
	


}
