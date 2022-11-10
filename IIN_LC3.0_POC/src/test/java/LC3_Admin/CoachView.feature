@CoachView
Feature: Coach view login functionality



Scenario Outline: As a coach i want to login and view my student and and my coaching circles on Coach view page

Given Coach is on Student Portal Login page
When coach enters "<username>" and "<password>"
And clicks on the Continue button
And Coach directs to the "My Coaching Circles" page
And verify Coach able to navigate to all the "ReviewCC"
And again click on the "ReviewCC1"
And click on the View details link
And click on the Sessions tab
And click on the Students tab
Then logout from Student portal



Examples:
|username |password|
|matthan.maxamus@fillnoo.com|Test@1234|