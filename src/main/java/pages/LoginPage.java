package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage {

	private WebDriver driver;

//	private By usernameTextbox = By.id("username");
	@FindBy(id="username")
	WebElement usernameTextbox;
	
//	private By passwordTextbox = By.name("password");
	@FindBy(name="password")
	WebElement passwordTextbox;
	
//	private By submitButton = By.id("submit");
	@FindBy(id="submit")
	WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		Log.info("Entering username : "+username);
//		driver.findElement(usernameTextbox).sendKeys(username);
		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		Log.info("Entering password : "+password);
//		driver.findElement(passwordTextbox).sendKeys(password);
		passwordTextbox.sendKeys(password);
	}

	public void clickSubmitButton() {
		Log.info("Clicking login button.");
//		driver.findElement(submitButton).click();
		submitButton.click();
	}
}
