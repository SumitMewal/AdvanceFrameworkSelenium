package ssm.hrm.FrameworkUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ssm.hrm.DriverManager.DriverMangerClass;
import ssm.hrm.EnumStore.WaitEnum;
import ssm.hrm.FrameworkConstants.FrameWorkConstantClass;

public final class WaitStrategyUtil {

	private WaitStrategyUtil() {}

	public static WebElement explicitWait(WaitEnum waitStrategy, By by)
	{
		if(waitStrategy == WaitEnum.CLICKABLE)
		{
			return  new WebDriverWait(DriverMangerClass.getDriver(), Duration.ofSeconds(FrameWorkConstantClass.getExplicitwaittime())).
					until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy == WaitEnum.PRESENT)
		{
			return	new WebDriverWait(DriverMangerClass.getDriver(), Duration.ofSeconds(FrameWorkConstantClass.getExplicitwaittime())).
					until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy == WaitEnum.VISIBLE)
		{
			return	new WebDriverWait(DriverMangerClass.getDriver(), Duration.ofSeconds(FrameWorkConstantClass.getExplicitwaittime())).
					until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy == WaitEnum.SELECTABLE)
		{
			return	new WebDriverWait(DriverMangerClass.getDriver(), Duration.ofSeconds(FrameWorkConstantClass.getExplicitwaittime())).
					until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		return null;

	}


}
