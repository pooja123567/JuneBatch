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

public class TC3_GetParticular {
	@Test
	public static void testcase3() throws IOException
	{
		ExtentReports report= ReportHandling.takeReport("C:\\report\\report.html");
		ExtentTest test1=report.startTest("TC3_GetParticular");
	Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
    HTTPMethods http=new HTTPMethods(pr);
Response res=http.getParticularmethod("URI_4",TC1_PostRequest.returnidvalue);
ValidateResponse.validateStatusCode(200, res,test1,"TC3_GetParticular");
report.endTest(test1);
report.flush();
//ValidateResponse.validateResponseData("Software engineer",res,"Designation");
}
}
