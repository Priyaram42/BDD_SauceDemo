Feature: Product 

Scenario Outline: Successfully login into Saucedemo
Given user is on login page
When user enters username "<Username>" and password "<Password>" and click on login button
And user selects a product from the product list
And user clicks on add to cart button
Then user verifies the product is added to the cart
Then user logout

Examples: 
          |Username       |Password    |selectProduct      |addToCartButton|
          |standard_user  |secret_sauce|Sauce Labs Backpack|add-to-cart    |
          |problem_user   |secret_sauce|Sauce Labs Backpack|add-to-cart    |