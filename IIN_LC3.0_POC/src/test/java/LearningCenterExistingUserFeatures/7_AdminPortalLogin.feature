@AdminLogin
Feature: Admin Login functionality


Scenario Outline: As an admin I need to Login to application
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
Then Admin Navigates to "Applications Dashboard" Page 



Examples: 
 |							Username                  |password  |  
 | QATeam@integrativenutrition.com | Password123 |

