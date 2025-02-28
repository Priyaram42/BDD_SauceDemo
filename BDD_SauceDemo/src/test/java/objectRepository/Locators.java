package objectRepository;

import org.openqa.selenium.By;

public class Locators {

	// Login Page

	public static By userName = By.id("user-name");
	public static By password = By.id("password");
	public static By loginButton = By.id("login-button");
	public static By verifyCartButton = By.id("shopping_cart_container");

	// productList SetUp
	public static By selectProduct = By.xpath("//div[text() = 'Sauce Labs Backpack']");
	public static By addToCartButton = By.id("add-to-cart");
	public static By removeFromCart = By.id("remove");

	// Clicking on the cart button

	public static By addToCartIcon = By.className("shopping_cart_link");
	public static By yourCartDisplay = By.xpath("//span[text() = 'Your Cart']");

	// CheckOut Page

	public static By checkout = By.id("checkout");
	public static By firstName = By.id("first-name");

	// Information passing
	public static By enterFirstName = By.id("first-name");
	public static By enterLastName = By.id("last-name");
	public static By enterpinCode = By.id("postal-code");
	public static By clickContinue = By.id("continue");
	public static By verifyOverView = By.xpath("//span[text() = 'Checkout: Overview']");

	// checkout view

	public static By finishButton = By.id("finish");
	public static By orderConfirmation = By.xpath("//h2[text() = 'Thank you for your order!']");
	public static By backHomeButton = By.id("back-to-products");
	
	//LogOut of Webpage
	
	public static By menuButton = By.id("react-burger-menu-btn");
	public static By logoutButton = By.id("logout_sidebar_link");
}
