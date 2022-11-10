@CoachingCircle
Feature: Student coaching circle

Scenario Outline: As a Student I need to login into student portal as existing user

Given existing Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "Continue" 
And Student Clicks "Letsgetstarted" 
And Clicks on "CoachingCircle" tab
#And Selects the "VerifyCoachName""<CoachName>"
#And Clicks on "Submit"
And User click on click here for "transfer"
And select  any different "VerifyCoachName""<CoachName2>"
And click confirm
And Click on Web URL link for "conference"
And User should be Able to Logout


Examples:

|Username| password| CoachName|CoachName2|
|lewyn.epifanio@fillnoo.com|Subh@1993|Test Data|test test|