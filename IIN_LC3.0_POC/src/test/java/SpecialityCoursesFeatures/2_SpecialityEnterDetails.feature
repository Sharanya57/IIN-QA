@SpecialityDetailsPage
Feature: Create profile for Student 

 Scenario Outline: As a Student I need to create My profile


When user Enters the "<password>"
And User Enters "<Firstname>","<Middlename>","<Lastname>"
And User Enters "<DOB>","<Gender>","<CountryCode>","<MobilePhone>","<Address>"
And User clicks to Continue Button 


Examples:
 
|Username                   |password  |Firstname    |Middlename|Lastname| DOB        | Gender   |CountryCode |MobilePhone |Address|
|k@k.com |Qwertyui1 |Shilpi     | Singh    |Khokhar  | 11111990   | Female   |      +91   | 9540060668 |230 5th Avenue, New York, NY, USA|
