package stepdefinitions;

import static org.junit.Assert.*;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.CheckoutOverviewPage;
import pages.ClickCheckoutPage;
import pages.InformationPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ProductListPage;
import utils.Base;

public class PlaceOrderStepDef extends Base {
	
	LoginPage loginPage;
	LogoutPage logoutPage;
	
	boolean actResult;
		
	
	@Before
	public void beforeScenario() {
		System.out.println("*********Before Scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("********After Scenario");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		launchBrowser();		
	}

	@When("user enters username {string} and password {string} and click on login button")
	public void user_enters_username_and_password_and_click_on_login_button(String userName, String passWord) {
		LoginPage loginpage = new LoginPage(driver);
		actResult = loginpage.validateLogin(userName, passWord);
		assertTrue(actResult);
	}

	@When("user selects the product")
	public void user_selects_the_product() {
		 ProductListPage productListPage = new ProductListPage(driver);
		    actResult = productListPage.productsList();
		    assertTrue(actResult);

	}

	@When("user clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
		AddToCartPage addToCartPage = new AddToCartPage(driver);
	    actResult = addToCartPage.cart();
	    assertTrue(actResult);
	}

	@When("user click cart button")
	public void user_click_cart_button() {
		AddToCartPage clickoncartbutton = new AddToCartPage(driver);
		actResult = clickoncartbutton.cart();
		Assert.assertTrue(actResult);
		
	}

	@When("user clicks checkout button")
	public void user_clicks_check_button() {
		ClickCheckoutPage checkoutPage = new ClickCheckoutPage(driver);
	    actResult = checkoutPage.checkout();
	    assertTrue(actResult);
	}

	@When("user enter user user information and click continue")
	public void user_enter_user_user_information_and_click_continue() {
		InformationPage infoPage = new InformationPage(driver);
	    actResult = infoPage.enterInformation(enterFirstName, enterLastName, enterpinCode);
	    assertTrue(actResult);
	}

	@Then("user verify the product information")
	public void user_verify_the_product_information() {
		CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
	    actResult = overviewPage.checkOverview();
	    assertTrue(actResult);
	}

	@Then("user logout")
	public void user_logout() {
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.logout();
		assertTrue(actResult);
		Base.sleep(3000);
		driver.quit();

	}

}
