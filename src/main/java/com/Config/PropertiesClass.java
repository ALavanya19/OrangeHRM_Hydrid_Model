package com.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	private static FileInputStream propFile;
	private static Properties prop;
	
	public static void loadProperties(String propFilePath) throws IOException {
		
		propFile=new FileInputStream(propFilePath);
		prop=new Properties();
		prop.load(propFile);
		
	}
	
	public static String getProperties(String propertyName) {
		return prop.getProperty(propertyName);
	}
	
}
