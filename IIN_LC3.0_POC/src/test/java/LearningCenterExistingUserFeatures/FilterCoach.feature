@FilterCoach
 Feature: Filter coach details in admin portal


 Scenario Outline: As an admin I need to Filter coach details
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
And Admin clicks on Menu Icon 
And Admin Navigates to users>coaches
And Admin Filters Coach based on Profile "<fname>"
And Admin Filters Coach based on Age <ageleft> and <ageright>
And Admin Filters Coach based on Gender
And Admin Filters Coach based on Location
And Admin Filters Coach based on Languages
And Admin Filters Coach based on Cohorts
And Admin Filters Coach based on Programs
And Admin Filters Coach based on Has coaching circle



Examples: 
 |							Username                  |password  |    fname| ageleft | ageright| 
 | QAteam@integrativenutrition.com | Password123 | ravi        | 44    |  71    |
 





