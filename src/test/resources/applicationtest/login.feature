Feature: Login functionality
Scenario: Login validation with credentials
Given User is at login screen
When User enters username
And User enters password
And User clicks on login button
Then User should get redirect to home page

Scenario: title validation
Given User is at login screen
When User get the title of page
Then Page title should be verified

