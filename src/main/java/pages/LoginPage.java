package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By usernameTextbox = By.id("username");
	private By passwordTextbox = By.name("password");
	private By submitButton = By.id("submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameTextbox).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
	}

	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
}
