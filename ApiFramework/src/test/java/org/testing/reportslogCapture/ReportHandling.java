package org.testing.reportslogCapture;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling {
	
	public static ExtentReports takeReport(String path)
	{
		ExtentReports reports=new ExtentReports(path,false);
		return reports;
	}
	

}
