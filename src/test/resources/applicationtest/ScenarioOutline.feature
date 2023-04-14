Feature: Signup
Scenario Outline: Signup to application with different combinations
Given User is at the signup page
When User enters "<name>" on form
And User enters "<age>" inside the form
And User confirms the "<gender>" inside form

Examples:
| name | age | gender |
| Eder | 18 | Male |
| Ron | 5 | Male |
| Diana | 68 | Female |

