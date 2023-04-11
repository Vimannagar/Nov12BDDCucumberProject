Feature: Login functionality
Scenario: Login validation with credentials
Given User is at login screen
When User enters username
And User enters password
And User clicks on login button
Then User should get redirect to home page