 package com.LMS.DriverFactory;

import java.time.Duration;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

		public WebDriver driver;
		public WebDriverWait wait;

		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

		/**
		 * This method is used to initialize the thradlocal driver on the basis of given
		 * browser
		 * 
		 * @param browser
		 * @return this will return tldriver.
		 */
		public WebDriver init_driver(String browser) {
			
			
			System.out.println("browser value is: " + browser);

			if (browser.equals("chrome")) {
//				ChromeOptions co= new ChromeOptions();
//				co.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				tlDriver.set(new ChromeDriver());
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver());
			} else if (browser.equals("safari")) {
				tlDriver.set(new SafariDriver());
			} else if (browser.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					tlDriver.set(new EdgeDriver());}
					else {
				System.out.println("Please pass the correct browser value: " + browser);
			}

			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();

		}

		/**
		 * this is used to get the driver with ThreadLocal
		 * 
		 * @return
		 */
		public static synchronized WebDriver getDriver() {
			return tlDriver.get();
		}
	}