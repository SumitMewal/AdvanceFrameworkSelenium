package ssm.hrm.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import ssm.hrm.Reports.ReportFactory;
import ssm.hrm.Reports.ReportLogger;

public final class ListenerClass implements ITestListener,ISuiteListener {


	public static ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {

		ReportFactory.initReport();

	}

	@Override
	public void onFinish(ISuite suite) {

		ReportFactory.flush();
	}

	@Override
	public void onStart(ITestContext context) {
		//ReportFactory.createTest(context.getName()+" test is Started");	
	}

	@Override
	public void onTestStart(ITestResult result) {

		ReportFactory.createTest(result.getMethod().getMethodName()+" is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		ReportLogger.pass(result.getMethod().getMethodName()+" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ReportLogger.fail(result.getMethod().getMethodName()+" is failed");
	}

	@Override
	public void onFinish(ITestContext context) {
		
	//	ReportFactory.createTest(context.getName()+" test is finished");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ReportLogger.skip(result.getMethod().getMethodName()+" is skiped");
	}





}
