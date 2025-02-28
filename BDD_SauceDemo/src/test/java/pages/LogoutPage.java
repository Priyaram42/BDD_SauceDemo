package pages;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;

import objectRepository.Locators;
//import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Base;

public class LogoutPage {

	private WebDriver driver;
	// private WebDriverWait wait;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void logout() {
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.menuButton).click();
		Base.sleep(Base.WAITTIME);
		driver.findElement(Locators.logoutButton).click();
	}

}
