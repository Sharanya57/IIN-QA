@StudentPortalLogin
Feature: Login at Student portal
         	

Scenario Outline: As a Student I need to login into student portal as existing user

Given existing Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "Continue" Button
And User should be Able to Logout
 
 
Examples:

| Username      | password      | 
|araz.rudy@orperfect.com |Vali@123|
