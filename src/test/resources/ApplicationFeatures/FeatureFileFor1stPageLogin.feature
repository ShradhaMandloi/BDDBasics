Feature: Login Functionality
Scenario: Login with correct credentials
Given User is at the login screen
When User enters username 
And User enters password
And User click on login button
Then User should be on the home page

Scenario: Validate Title
Given User is at the login screen
Then Page title should get display

