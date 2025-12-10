package ssm.hrm.FrameworkUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import ssm.hrm.FrameworkConstants.FrameWorkConstantClass;

public final class ReadExcelUtil {
	private ReadExcelUtil() {}

	public static Object[] readExcelData(String sheetName) throws IOException
	{
		FileInputStream file = new FileInputStream(FrameWorkConstantClass.getExcelfilepath());
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =  workbook.getSheet(sheetName);
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();
		Object[] data = new Object[rownum];
		Map<String,String> map;
		for(int i =0;i<rownum;i++)
		{
			map = new HashMap<>();
			for (int j =0;j<colnum-1;j++)
			{
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i+1).getCell(j).getStringCellValue();
				//System.out.println(key+" "+value);
				map.put(key, value);
				data[i] = map;
			}
		}
		return data;
	}

}
