package ssm.hrm.tests;

import org.testng.annotations.Test;

import ssm.hrm.DriverManager.DriverMangerClass;

public class LoginTest extends BaseTest {

	@Test
	public void guestLogin()
	{
		DriverMangerClass.getDriver().get("https://www.google.com/?zx=1764237865905&no_sw_cr=1");
		System.out.println("Login Test");
	}

}
