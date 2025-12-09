package ssm.hrm.PageObject;

import org.openqa.selenium.By;
import ssm.hrm.EnumStore.WaitEnum;
import ssm.hrm.FrameworkUtils.WaitStrategyUtil;

public class BasePageObject {

	protected BasePageObject()
	{

	}
	public void click(By by, WaitEnum waitStrategy)
	{
		WaitStrategyUtil.explicitWait(waitStrategy, by).click();
	}
	public void sendKeys(By by, WaitEnum waitStrategy, String value)
	{
		WaitStrategyUtil.explicitWait(waitStrategy, by).sendKeys(value);
	}
	public String getText(By by,WaitEnum waitStrategy)
	{
		return	WaitStrategyUtil.explicitWait(waitStrategy, by).getText();
	}




}
