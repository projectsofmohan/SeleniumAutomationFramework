package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("student");
		loginPage.enterPassword("Password123");
		loginPage.clickSubmitButton();
		System.out.println("Title : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
	}
}
