@SpecialitySSO
Feature: Check SSO Functionality is working as expected


Scenario: As a student I need to access the courses after clicking on continue learning
   

When Student clicks on My course tab
And studnet clicks on continue learning tab on my course page
And student should be redirected to modules section
And student checks the FirstModuleName text
And student clicks on Satrt button on Learning page
Then student will be redirected to the module page which is same.






