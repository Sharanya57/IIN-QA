@CommunicationToggleButtons
Feature: Check Communication Toggle Buttons are working

  Scenario Outline: As a student I need to check toggle buttons functionality
 
Given Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "Continue" Button
#And Student changes URL
#Then Student Navigates to Course Enrollment Page 
And Student clicks on My Payment 
And Student clicks on Communication Preferences
Then Student checks toggle button are working for each of Voice mail sms whatsapp

Examples: 
 |Username             |password    |
 |royel.arthas@ifyourock.com|Qwertyui1  | 


