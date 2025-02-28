package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Locators;
import utils.Base;

public class InformationPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public InformationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public boolean enterInformation(String fName, String lName, String pincode) {
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.enterFirstName).sendKeys(fName);
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.enterLastName).sendKeys(lName);
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.enterpinCode).sendKeys(pincode);
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.clickContinue).click();
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyOverView));
		} catch (TimeoutException te) {
			Base.captureScreenShot("Verify_Failure");
			actResult = false;
		}
		return actResult;
	}

}
