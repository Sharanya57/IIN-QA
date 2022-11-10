@ResetPassword
Feature: Reset Password Student Portal

Background: 
Given user is on application Login Page 
           	

Scenario Outline: As a Student I need to Reset the Student Password and then Login with new password


When user Enters the "<Username>" and "<oldpassword>"
And User Clicks on "Continue" Button
#Then Student Navigates to Course Enrollment Page 
And User Navigates to ManageAccount 
Then User Should be Able to reset the Password "<newpassword>","<oldpassword>"
And User should be Able to Logout

Examples:

| Username      | oldpassword |  newpassword|
|akilan.riyad@fillnoo.com| Vali@1238  | Vali@1239 |

Scenario Outline: As a Student I will be able to Login after Resetting Password
  
  
When user Enters the "<Username>" and "<newpassword>"
And User Clicks on "Continue" Button
And User should be Able to Logout

Examples:

| Username      | newpassword |
| akilan.riyad@fillnoo.com|  Vali@1239|


