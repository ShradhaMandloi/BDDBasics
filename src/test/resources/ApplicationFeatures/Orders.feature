Feature: Order Informaion

Background:
Given User should be logged in 
When  User clicks on orders link
 
Scenario: Priviously placed order information
When User clicks on past order button 
Then User should beable to see past order

Scenario: Current order information
When User clicks on current order button
Then User should able to see current order


