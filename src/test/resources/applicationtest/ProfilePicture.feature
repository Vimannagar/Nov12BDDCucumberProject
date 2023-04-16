Feature: Profile picture functionality

@sanity
Scenario: Add profile picture
Given user is on home page
When user click on the avatar
And user selects the image to upload
Then profile picture gets uploaded

@regression
Scenario: update profile picture
Given user is on home page
When user click edit for avatar
And user updates the picture
Then profile picture gets updated

@functional
Scenario: delete profile picture
Given user is on home page
When user click on the delete profile picture link
And user confirms delete picture
Then profile picture gets deleted