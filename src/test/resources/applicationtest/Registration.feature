Feature: Registration of Bank account
Scenario: user information for bank account opening
Given user should be at registration page
When user enters the following data
|Erin| Smith | erinsmith@abc.com | 8877665544 |
|Robert| Jackson | rj@abc.com | 9977665544 |
Then user gets registration confirmation


