package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.reportslogCapture.ReportHandling;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC5_DeleteRequest {
	@Test
	public static void test_case5() throws IOException {
		ExtentReports report= ReportHandling.takeReport("C:\\report\\report.html");
		ExtentTest test1=report.startTest("TC5_DeleteRequest");
		Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
    HTTPMethods http=new HTTPMethods(pr);
   Response res =http.deletemethod("URI_4",TC1_PostRequest.returnidvalue );
   ValidateResponse.validateStatusCode(200, res,test1,"TC5_DeleteRequest");
   report.endTest(test1);
   report.flush();
  // ValidateResponse.validateResponseData("Software engineer",res,"Designation");
    }
}
