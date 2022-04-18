package com.Practice;

import org.testng.annotations.Test;

import com.VTigerr.genericLib.ExcelUtil;
import com.VTigerr.genericLib.IAutoConstants;

public class ReadDataFromExcelTest {
	
	
	@Test
	public void launchbrowser() throws Throwable 
	{
		ExcelUtil excelUtil = new ExcelUtil();
		int lastrow=excelUtil.getRowCount(IAutoConstants.EXCEL_PATH, "Sheet1");

		for (int i = 0; i <= lastrow; i++) 
		{
			System.out.println(excelUtil.readStringdatafromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", i, 0));
		}

}
}