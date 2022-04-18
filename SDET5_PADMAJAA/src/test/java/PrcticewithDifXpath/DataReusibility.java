package PrcticewithDifXpath;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReusibility {

	@Test(dataProvider="obj")
	
	public void dataprovider(String src, String des, String stop) 
	{
		System.out.println(src);
	}

@DataProvider
public Object[][] values()
{	

Object obj[][]=new Object[3][3];
		obj[0][0]="Hyd";
        obj[0][1]="Ban";
        obj[0][2]="Ban";
        
        obj[0][0]="Hyd";
        obj[0][1]="CCU";
        obj[0][2]="Hyd";
		return obj;
	
}
}
