package ssm.hrm.Driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ssm.hrm.DriverManager.DriverMangerClass;
import ssm.hrm.EnumStore.ConfigEnum;
import ssm.hrm.FrameworkUtils.PropertyUtil;

public final class DriverFactoryClass {

	private DriverFactoryClass()
	{

	}

	
	public static void init()
	{
		/*
		 * ThreadLocal itself ensures thread safety — so you should not control driver creation using a static variable or if-null check.
		 
		 */
	// 	if(Objects.isNull(driver))  // I have removed this due to above 
		
			WebDriver driver = new ChromeDriver();; // This should not be static because of this it is giving the issue of null driver
			DriverMangerClass.setDriver(driver);
			DriverMangerClass.getDriver().manage().window().maximize();
			DriverMangerClass.getDriver().get(PropertyUtil.getValue(ConfigEnum.URL));
			
	}

	public static void tearDown()
	{
		if(Objects.nonNull(DriverMangerClass.getDriver()))
		{
			DriverMangerClass.getDriver().quit();
			DriverMangerClass.remove();
		}
	}

}
