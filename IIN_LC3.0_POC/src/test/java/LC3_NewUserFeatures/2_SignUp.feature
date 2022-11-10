@IINSIGNUP
Feature: Create profile for Student 

 
           	

Scenario Outline: As a Student I need to create My profile

#Given user is on application Login Page
#When user Enters the email "<Username>"
#And User clicks to Continue Button
When user Enters the "<password>"
And User Enters "<Firstname>","<Middlename>","<Lastname>"
And User Enters "<DOB>","<Gender>","<CountryCode>","<MobilePhone>","<Address>"
And User clicks to Continue Button 
Then User lands on "Please choose your language and program length" page

Examples:
 
          | password        |Firstname    |Middlename|Lastname| DOB        | Gender   |CountryCode |MobilePhone |Address|
|Subh@1987 |Shilpi   | Singh    |Rajput  | 11111990   | Female   |      +91   | 9540060668 |aaaa|
