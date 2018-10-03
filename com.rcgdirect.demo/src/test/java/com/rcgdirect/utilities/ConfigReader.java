package com.rcgdirect.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties configFile;
	
	static {
		
		try {
			
			String path = "configuration.properties";
			FileInputStream fileInput = new FileInputStream(path);
			
			configFile = new Properties();
			configFile.load(fileInput);
			
			fileInput.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return configFile.getProperty(key);
	}
	
}
