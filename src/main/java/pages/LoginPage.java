package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Log;

public class LoginPage {

	private WebDriver driver;

	private By usernameTextbox = By.id("username");
	private By passwordTextbox = By.name("password");
	private By submitButton = By.id("submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		Log.info("Entering username : "+username);
		driver.findElement(usernameTextbox).sendKeys(username);
	}

	public void enterPassword(String password) {
		Log.info("Entering password : "+password);
		driver.findElement(passwordTextbox).sendKeys(password);
	}

	public void clickSubmitButton() {
		Log.info("Clicking login button.");
		driver.findElement(submitButton).click();
	}
}
