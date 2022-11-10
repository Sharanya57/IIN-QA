@SpecialitySelectCoursePage
Feature: Enroll at Student to a course
         	

Scenario: As a Student I need to Enroll to in a course 


When Student select any course from specialty courses (Bundle, WPH, DYL)
And Student clicks on "Next" Button
Then Student redirects to "Pending Signing Requests" page

