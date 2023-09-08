package com.LMS.AppHooks;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.LMS.DriverFactory.DriverFactory;
import com.LMS.Utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private static DriverFactory driverFactory;
	private static WebDriver driver;
	private static ConfigReader configReader;
	static Properties prop;
	
	@Test
	
	@BeforeAll(order = 0)
	public static void getProperty() throws Throwable {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@BeforeAll(order = 1)
	public static void launchBrowser() throws Throwable {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}

	@AfterAll(order = 1)
	public static void quitBrowser() {
		driver.quit();
	}

	@After(order = 0)
	public static void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

}