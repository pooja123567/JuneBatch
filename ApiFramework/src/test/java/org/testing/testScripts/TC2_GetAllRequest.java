package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.reportslogCapture.ReportHandling;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC2_GetAllRequest {
	@Test
	public void testcase_2() throws IOException {
		ExtentReports report= ReportHandling.takeReport("C:\\report\\report.html");
		ExtentTest test1=report.startTest("TC2_GetAllRequest");
		Properties pr=PropertiesHandle.loadProperties("../ApiFramework/URI.properties");
     HTTPMethods http=new HTTPMethods(pr);
	Response res=http.getmethod("URI_4");
	ValidateResponse.validateStatusCode(200, res,test1,"TC2_GetAllRequest");
	report.endTest(test1);
	report.flush();
	JsonParsingUsingOrgJson.jsonParsing(res.asString(),"firstname");
	}

}
