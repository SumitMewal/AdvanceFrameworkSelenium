package ssm.hrm.tests;

import org.testng.annotations.Test;

import ssm.hrm.DriverManager.DriverMangerClass;

public class HomeTest extends BaseTest {
	
	@Test
	public void loginAdmin()
	{
		DriverMangerClass.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Home Test");
	}

}
