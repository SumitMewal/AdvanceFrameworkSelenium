package ssm.hrm.DataProviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import ssm.hrm.FrameworkUtils.ReadExcelUtil;

public final class LoginData {
	private LoginData() {}

	@DataProvider(name="invalidData", parallel = true)
	public static Object[] invalidData() throws IOException
	{
		return ReadExcelUtil.readExcelData("invalidLoginData");
	}

}
