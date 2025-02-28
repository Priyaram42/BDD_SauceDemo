Feature: Login 

Scenario Outline: Successfully login into Saucedemo
Given user is on login page
When user enters username "<Username>" and password "<Password>" and click on login button
Then user logout

Examples: 
          |Username       |Password    |
          |standard_user  |secret_sauce|
          |problem_user   |secret_sauce| 