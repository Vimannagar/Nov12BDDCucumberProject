Feature: Login with specific data
Scenario: Login with valid cred
Given User is at login page
When User enters username as "userone"
And User enters password as "passwordone"
And User clicks on login 1 button 
Then User should gets logged into the app
