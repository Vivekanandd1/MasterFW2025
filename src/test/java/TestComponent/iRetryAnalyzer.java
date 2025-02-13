package TestComponent;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class iRetryAnalyzer implements IRetryAnalyzer {
     int count = 0;
     int maxtry = 0;
	@Override
	public boolean retry(ITestResult result) {
		if (count<maxtry) {
			count ++;
			return true;
		}
		return false;
	}

}
