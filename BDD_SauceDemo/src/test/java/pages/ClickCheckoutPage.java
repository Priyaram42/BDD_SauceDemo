package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class ClickCheckoutPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public ClickCheckoutPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public boolean checkout() {
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.checkout).click();
		boolean actResult = true;

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstName));
		} catch (TimeoutException te) {
			Base.captureScreenShot("Checkout_Failure");
			actResult = false;
		}
		return actResult;
	}

}
