package com.LMS.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
   public final static String propertyFilePath="/Users/garvit/eclipse-workspace/March_1/src/test/resources/config/config.properties";


	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}
	
	public static String getassignment() {
		String assignmentUrl = prop.getProperty("assignmentUrl");
		if (assignmentUrl != null)
			return assignmentUrl;
		else
			throw new RuntimeException("assignmentUrl not available in the Config.properties file.");
		
	}

}