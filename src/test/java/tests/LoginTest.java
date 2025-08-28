package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest{

	@Test
	public void positiveLogInTest() {
		Log.info("Starting login test ...");
		test = ExtentReportManager.createTest("Positive LogIn test"); 
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigated to Login Page");
		loginPage.enterUsername("student");
		loginPage.enterPassword("Password123");
		loginPage.clickSubmitButton();
		test.info("Entered login credentials and clicked on Submit button");
		System.out.println("Title : "+driver.getTitle());
		Log.info("Verifying page title...");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		Log.info("Login test completed.");
		test.pass("Login successful");
	}
	
	@Test
	public void negativeUsernameTest() {
		Log.info("Starting login test ...");
		test = ExtentReportManager.createTest("Negative username test"); 
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigated to Login Page");
		loginPage.enterUsername("incorrectUser");
		loginPage.enterPassword("Password123");
		loginPage.clickSubmitButton();
		test.info("Entered login credentials and clicked on Submit button");
		System.out.println("Title : "+driver.getTitle());
		Log.info("Verifying page title...");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		Log.info("Login test completed.");
		test.pass("Login successful");
	}
	
	@Test
	public void negativePasswordTest() {
		Log.info("Starting login test ...");
		test = ExtentReportManager.createTest("Negative password test"); 
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigated to Login Page");
		loginPage.enterUsername("student");
		loginPage.enterPassword("incorrectPassword");
		loginPage.clickSubmitButton();
		test.info("Entered login credentials and clicked on Submit button");
		System.out.println("Title : "+driver.getTitle());
		Log.info("Verifying page title...");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		Log.info("Login test completed.");
		test.pass("Login successful");
	}
}
