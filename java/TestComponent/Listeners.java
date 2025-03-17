package TestComponent;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import AbstractComponents.BaseTest;
import Resources.ExtentReportNG;


public class Listeners extends BaseTest implements ITestListener {

        ExtentTest test;
		ExtentReports extent = ExtentReportNG.getReportObject();
		ThreadLocal <ExtentTest> extentTest = new ThreadLocal<ExtentTest>();//Object creation for overriding the test element
		
		@Override
		 public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getMethod().getMethodName());
			extentTest.set(test);//will create unique id for every testcases for parallel runs.
			  }

		@Override 
		public void onTestSuccess(ITestResult result) {
			extentTest.get().log(Status.PASS, "Test Passed");
		}

		@Override
		 public void onTestFailure(ITestResult result) {
			extentTest.get().fail(result.getThrowable());
			try {
				driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		    String Filepath = null;
		    try {
				 Filepath = getScreenshot(result.getMethod().getMethodName(),driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    extentTest.get().addScreenCaptureFromPath(Filepath, result.getMethod().getMethodName());
		  }
			  

		@Override
		 public void onTestSkipped(ITestResult result) {
			    // not implemented
			  }

		@Override
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			    // not implemented
			  }

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			    onTestFailure(result);
			  }

		@Override
		public void onStart(ITestContext context) {
			    // not implemented
			  }

		@Override
		public void onFinish(ITestContext context) {
			    extent.flush();
			  }

	}


