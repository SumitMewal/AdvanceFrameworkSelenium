package ssm.hrm.PageObject;

import org.openqa.selenium.By;

import ssm.hrm.EnumStore.WaitEnum;
public final class LoginPageObject extends BasePageObject {

	private final By txtboxUsername = By.name("username");
	private final By txtboxPassword = By.xpath("//input[@name='password' and @type='password']");
	private final By btnLogin =By.xpath("//button[@type='submit']") ;

	
	// No need to give by in the parameter
	public LoginPageObject enterUsername(String username)
	{
		sendKeys(txtboxUsername, WaitEnum.VISIBLE, username);
		return this;
	}

	public LoginPageObject enterPassword(String password)
	{
		sendKeys(txtboxPassword, WaitEnum.VISIBLE, password);
		return this;
	}
	public HomePageObject clickLogin()
	{
		click(btnLogin, WaitEnum.CLICKABLE);
		return new HomePageObject();
	}
}
