package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class ProductListPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public ProductListPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public boolean productsList() {
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.selectProduct).click();
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.addToCartButton).click();
		Base.sleep(Base.WAITTIME);
		boolean actResult = true;

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.removeFromCart));
		} catch (TimeoutException te) {
			Base.captureScreenShot("AddToCart_Failure");
			actResult = false;
		}
		return actResult;

	}

}
