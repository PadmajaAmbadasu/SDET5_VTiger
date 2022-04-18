package com.Practice;

import org.testng.annotations.Test;

import com.VTigerr.genericLib.ExcelUtil;
import com.VTigerr.genericLib.IAutoConstants;

public class ExcelDataSaltest {

	
	@Test
	public void SalMore() throws Throwable 
	{
		ExcelUtil excelUtil = new ExcelUtil();
		int lastrow=excelUtil.getRowCount(IAutoConstants.EXCEL_PATH, "Sheet1");
		for (int i = 0; i <= lastrow; i++) 
		{
			int sal=excelUtil.readNumericdatafromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", i, 1);
			
			if(sal>=30000) 
			{
				String name=excelUtil.readStringdatafromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", i, 0 );
				System.out.println(name);
		}
			
	}	
	}
}
