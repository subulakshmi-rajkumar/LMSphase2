package com.LMS.testRunner;
//import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com.LMS.stepDefinitions","com.LMS.AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","html:target/cucumber-reports.html"
				
		},
		monochrome=true
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	
//	public final static ThreadLocal<String> Browser = new ThreadLocal<>();
//	
//	@BeforeTest
//	@Parameters({"browser"}) 
//	
//	public void browserType(String browser) throws Throwable
//	{
//		MyTestRunner.Browser.set(browser);
//	}
	}
