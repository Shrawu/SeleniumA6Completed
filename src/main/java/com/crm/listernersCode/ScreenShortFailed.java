package com.crm.listernersCode;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.DwsScreenShot;

public class ScreenShortFailed extends DwsScreenShot implements ITestListener{

	
ExtentReports report;

ExtentSparkReporter spark;
ExtentTest test;

@Override
public void onTestStart(ITestResult result) {
	
	String t_name = result.getMethod().getMethodName();
	test.log(Status.PASS,t_name+"is success");
	
	
	
}
@Override

public void onTestSuccess (ITestResult result) {
	
	String t_name = result.getMethod().getMethodName();
	test.log(Status.PASS,t_name+"is success");
	
	
	
}

@Override
public void onTestFailure(ITestResult result) {
		String t_Name = result.getMethod().getMethodName();
		test.log(Status.FAIL,t_Name+"is Failure");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
}

 @Override
		public void onTestSkipped(ITestResult result) {
			String t_Name = result.getMethod().getMethodName();
			test.log(Status.SKIP,t_Name+"is Skipped");
		}
 @Override
 
 public void onStart(ITestContext context) {
	    spark = new ExtentSparkReporter("./Reports/failedTestCase.html");
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Shrawani");
		spark.config().setTheme(Theme.DARK);
		
		//create the extent report
		report = new ExtentReports();
		
		//configure extent report
		report.setSystemInfo("Os", "Window-100");
		
		
 }
		
		@Override
		public void onFinish(ITestContext context) {
			
			report.flush();
			
			
		}
		
 }











}
