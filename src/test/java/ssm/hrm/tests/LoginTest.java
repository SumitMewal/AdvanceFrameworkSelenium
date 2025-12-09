package ssm.hrm.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import ssm.hrm.PageObject.LoginPageObject;

public final class LoginTest extends BaseTest {

	@Test
	public void loginValidUser()
	{
	LoginPageObject lpo = new LoginPageObject();
	String userName = lpo.enterUsername("Admin").enterPassword("admin123").clickLogin().getUserName();
	assertThat(userName).isNotEmpty().isNotNull().isInstanceOfAny(String.class);
	}

}
