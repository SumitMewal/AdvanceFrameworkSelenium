package ssm.hrm.Reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	
	private ExtentManager() {}
	
	private static ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	
	 static ExtentTest getExtentTest()
	{
		return extenttest.get();
	}
	
	 static void setExtentTest(ExtentTest extenttestL)
	{
		extenttest.set(extenttestL);
	}
	
	 static void removeTest()
	{
		extenttest.remove();
	}
	
	

}
