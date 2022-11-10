@Refunds1
Feature: Admin adds refunds


Scenario Outline: As an admin I need to add refund for students
  
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
And Admin Navigates to "Applications Dashboard" Page 
And Admin clicks on Menu Icon 
And Admin Clicks on user tab
And Admin Clicks on student face icon
And Admin clicks on Search bar
And Admin enters "<userid>" of student
And Admin Clicks on avatar
And Admin Clicks on "Payment information" tab
And Admin clicks on "Payment plan terms" tab
And Admin Clicks on "Refund"
And Admin enters "<Amount>" and "<Comments>" to create refund screen
And Admin clicks on "create"
And Admin lands on Refund screen and open student and enters "Refund Amount"
And Admin click on "Submit Refunds"









Examples: 
 |							Username                  |password  |userid|Amount| Comments|
 | QAteam@integrativenutrition.com | Password123 |aram.arvin@aladeen.org|10000|Testing|
 