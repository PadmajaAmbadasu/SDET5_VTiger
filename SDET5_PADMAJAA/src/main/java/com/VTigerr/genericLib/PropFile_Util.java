package com.VTigerr.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFile_Util {
	
	/**
	 * This is t	 * @param propPath
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readdatafrompropfile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IAutoConstants.propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	/**
	 * @author Padmaja A
	 * This method helps us to read data
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readdatafrompropfile(String path,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

	
}





