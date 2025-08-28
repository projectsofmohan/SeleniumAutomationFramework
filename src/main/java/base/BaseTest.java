package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import utils.ExtentReportManager;
import utils.Log;

public class BaseTest {
	
	protected WebDriver driver;
	protected static ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent = ExtentReportManager.getReportInstance();
	}
	
	@AfterSuite
	public void tearDownReport() {
		extent.flush();
	}
	
	@BeforeMethod
	public void setUp() {
		Log.info("Setting up WebDriver...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating to test URL...");
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "Login Failure");
			System.out.println("Screenshot captured path: "+screenshotPath);
			test.fail("Test Failed. Screenshot attached.", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		}
		
		if(driver!=null) {
			Log.info("Closing browser...");
			driver.quit();
		}
	}

	/*
	 * https://practicetestautomation.com/practice-test-login/
	 * https://www.automationexercise.com/login
	 * 
	 * 
	 * 
	 */
	
}
