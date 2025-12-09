package ssm.hrm.FrameworkUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import ssm.hrm.EnumStore.ConfigEnum;
import ssm.hrm.FrameworkConstants.FrameWorkConstantClass;

public final class PropertyUtil {

	private PropertyUtil()
	{
		
	}
	
	private static Properties property;
	static
	{
		//getPropertyfilepath
		try {
			FileInputStream file = new FileInputStream(FrameWorkConstantClass.getPropertyfilepath());
			property = new Properties();
			property.load(file);
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(ConfigEnum propertyKey)
	{
		String value =  property.getProperty(propertyKey.toString().toLowerCase());
		if( Objects.isNull(value))
		{
			System.out.println("Value is null or incorrect!! Please check config.properties file!!");
		}
		return value;
		
	}
	
}
