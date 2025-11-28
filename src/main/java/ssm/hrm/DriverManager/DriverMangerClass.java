package ssm.hrm.DriverManager;

import org.openqa.selenium.WebDriver;

public final class DriverMangerClass {

	private DriverMangerClass()
	{

	}
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver()
	{
		return dr.get();
	}
	public static void setDriver(WebDriver driverIns)
	{
		dr.set(driverIns);
	}
	public static void remove()
	{
		dr.remove();
	}


}
