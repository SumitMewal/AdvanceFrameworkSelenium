package ssm.hrm.FrameworkConstants;

public class FrameWorkConstantClass {
	
	private final static int EXPLICITWAITTIME = 10;
	private final static String PROPERTYFILEPATH = "C:\\Users\\sumit\\Education\\advanceAutomation\\src\\main\\resources\\Config\\Config.properties";

	public static String getPropertyfilepath() {
		return PROPERTYFILEPATH;
	}

	public static int getExplicitwaittime() {
		return EXPLICITWAITTIME;
	}

}
