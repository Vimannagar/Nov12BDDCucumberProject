Feature: Profile functionality
Scenario: Add profile
Given user is at the home page
When user click on the add profile button
And user provides the information
Then profile gets created

Scenario: update profile
Given user is at the home page
When user click on the edit profile link
And user updates the information
Then profile gets updated

Scenario: delete profile
Given user is at the home page
When user click on the delete profile link
And user confirms delete
Then profile gets deleted