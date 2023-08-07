@CompaignFeature
Feature: Compaign functionality

@Profile @MiddleFunctionality
Scenario: Create Compaign
Given User should be logged into system
When User should click on create compaign button
And User enter name of compaign
Then Compaign gets created

@MiddleFunctionality
Scenario: Schedule a compaign
Given User should be logged into system
When User select a date for compaign
And Enter other details for scheduling a compaign
Then Compaign schedule

@Validation
Scenario: Validate Compaign details
Given User should be logged into system
When User clicks on review to validate all details
Then Compaign validated
