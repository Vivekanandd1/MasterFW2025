package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	public static ExtentReports getReportObject() {
		String Path = System.getProperty("user.dir")  + "//Reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Web Test Reports");
		reporter.config().setDocumentTitle("Test Report Analytics");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Vivek");
		return extent;


}
}