package ssm.hrm.Reports;

public final class ReportLogger {

	private ReportLogger() {}

	public static void pass(String message)
	{
		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message)
	{
		ExtentManager.getExtentTest().fail(message);
	}

	public static void skip(String message)
	{
		ExtentManager.getExtentTest().skip(message);
	}

}
