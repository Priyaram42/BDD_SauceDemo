package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public boolean validateLogin(String uName, String pwd) {
		driver.findElement(Locators.userName).sendKeys(uName);
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.password).sendKeys(pwd);
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.loginButton).click();

		boolean actResult = true;

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyCartButton));
		} catch (TimeoutException te) {
			Base.captureScreenShot("Login_Failure");
			actResult = false;
		}
		return actResult;
	}

}
