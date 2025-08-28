package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest{

	@Test
	public void testValidLogin() {
		Log.info("Starting login test ...");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("student");
		loginPage.enterPassword("Password123");
		loginPage.clickSubmitButton();
		System.out.println("Title : "+driver.getTitle());
		Log.info("Verifying page title...");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		Log.info("Login test completed.");
	}
}
