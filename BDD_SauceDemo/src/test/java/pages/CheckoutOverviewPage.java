package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class CheckoutOverviewPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void checkOverview() {
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.finishButton).click();
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.backHomeButton).click();
//		boolean actResult = true;
//
//		try {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.orderConfirmation));
//		} catch (TimeoutException te) {
//			Base.captureScreenShot("CheckoutOverview_Failure");
//			actResult = false;
//		}
//		return actResult;
	}
}
