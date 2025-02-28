package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class AddToCartPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public boolean cart() {
		driver.findElement(Locators.addToCartIcon).click();
		Base.sleep(Base.WAITTIME);
		boolean actResult = true;

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.yourCartDisplay));
		} catch (TimeoutException te) {
			Base.captureScreenShot("CartDisplay_Failure");
			actResult = false;
		}
		return actResult;
	}

}
