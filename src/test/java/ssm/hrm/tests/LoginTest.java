package ssm.hrm.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

import java.util.HashMap;

import org.testng.annotations.Test;

import ssm.hrm.DataProviders.LoginData;
import ssm.hrm.PageObject.LoginPageObject;

public final class LoginTest extends BaseTest {

	@Test(enabled = true, priority = 2)
	public void loginValidUser()
	{
	LoginPageObject lpo = new LoginPageObject();
	String userName = lpo.enterUsername("Admin").enterPassword("admin123").clickLogin().getUserName();
	assertThat(userName).isNotEmpty().isNotNull().isInstanceOfAny(String.class);
	}
	
	@Test(dataProviderClass = LoginData.class, dataProvider = "invalidData",
			enabled= true, priority = 1)
	public void loginInvalidUser(HashMap<String, String> map)
	{
		LoginPageObject lpo = new LoginPageObject();
		lpo.enterUsername(map.get("Username")).enterPassword(map.get("Password")).clickLogin();
	}

}
