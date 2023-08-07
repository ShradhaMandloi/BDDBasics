Feature: Profile Functionality
Scenario: Add Profile
Given User should on home page
When User clicks on add profile button 
And User enters the information 
Then Profile should be created

Scenario: Update Profile
Given User should on home page
When User clicks on edit profile button 
And User update the information 
Then Profile should be updated

Scenario: Delete Profile
Given User should on home page
When User clicks on delete profile button 
Then Profile should be deleted
