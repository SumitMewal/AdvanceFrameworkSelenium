package ssm.hrm.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ssm.hrm.FrameworkConstants.FrameWorkConstantClass;

public final class ReportFactory {

	private ReportFactory() {}

	private static ExtentReports extent;
	
	public static void initReport()
	{
		extent = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(FrameWorkConstantClass.getReportpath());
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("HRM-Report");
		sparkReporter.config().setReportName("Sumit Singh");
		sparkReporter.config().setTheme(Theme.DARK);
	}

	public static void flush()
	{
		extent.flush();
	}
	
	public static void createTest(String testName)
	{
		ExtentManager.setExtentTest(extent.createTest(testName));
	}


}
