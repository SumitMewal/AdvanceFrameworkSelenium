package ssm.hrm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ssm.hrm.Driver.DriverFactoryClass;

public class BaseTest {

/*
 * Why @BeforeMethod is correct
Annotation	Runs
@BeforeTest	Once before all tests inside <test> block
@BeforeMethod	Before every test method
@AfterMethod	After every test method
 
  
 * 
 */
	@BeforeMethod // I have replaced beforetest with beforemethod reason are above
	public void launchBrowser()
	{
		DriverFactoryClass.init();
	}

	@AfterMethod
	public void quitBrowser()
	{
		DriverFactoryClass.tearDown();

	}

}
