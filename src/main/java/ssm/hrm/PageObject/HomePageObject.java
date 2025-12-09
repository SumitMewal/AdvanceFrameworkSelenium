package ssm.hrm.PageObject;

import org.openqa.selenium.By;

import ssm.hrm.EnumStore.WaitEnum;

public final class HomePageObject extends BasePageObject {
	
	protected HomePageObject() {}
	
	private final By linkUserName = By.className("oxd-userdropdown-name");
	private final By  linkLogut = By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='Logout']");
	
	public String getUserName ()
	{
		return getText(linkUserName, WaitEnum.VISIBLE);
	}

	public LoginPageObject clickLogout()
	{
		click(linkLogut,WaitEnum.CLICKABLE);
		return new LoginPageObject();
	}

}
