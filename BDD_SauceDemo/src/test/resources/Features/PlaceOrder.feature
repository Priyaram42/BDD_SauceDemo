Feature: PlaceOrder 

Scenario: Successfully place an order
Given user is on login page
When user enters username "standard_user" and password "secret_sauce" and click on login button
And user selects the product
And user clicks add to cart button
And user click cart button 
And user clicks checkout button
And user enter user user information and click continue
Then user verify the product information
Then user logout
