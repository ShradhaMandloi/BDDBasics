Feature: Login Functionality with data
Scenario: Login with correct credentials
Given User is at login page
When User enter the username as "testusername"
And User enter the password as "testpassword"
And User click on the login button
Then User should be on home page
