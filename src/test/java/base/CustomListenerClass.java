package base;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import utilities.Utilities;

public class CustomListenerClass extends BaseClass implements ITestListener, ISuiteListener {

	@Override
	public void onTestStart(ITestResult arg0) {
	
		test = rep.startTest(arg0.getName().toUpperCase());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
		rep.endTest(test);
		rep.flush();
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.INFO, BaseClass.test.addScreenCapture(Utilities.screenshotName));
		
		rep.endTest(test);
		rep.flush();
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
	
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("TVO Hybrid Framework suite run started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("TVO Hybrid Framework suite run completed");
		
	}
	

}
