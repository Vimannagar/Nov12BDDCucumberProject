Feature: Order information
Background:
Given User should be logged into the application
When User clicks on orders link
Then user should redirect to orders page


Scenario: previouly placed order information
When user clicks on the past orders button
Then user should be able to see past order information

Scenario: currently placed order information
When user clicks on the current
Then user should be able to see placed order information