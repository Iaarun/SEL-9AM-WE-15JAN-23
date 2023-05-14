Feature:  Login functionality with positive data

@basiclogin @smoke
Scenario: user login with valid data
Given user is at the login page
When user provide username and password
And click on login button
Then user should be able to login


@invaliddata
Scenario: user login with incorrect password
Given user is at the login page
When user provide username and incorrect password
And click on login button
Then error should be displayed

@multidata
Scenario Outline: login feature with invalid credentail
Given user is at the login page
When user provide incorrect <username> and <password>
And click on login button
Then <error> should be displayed

Examples: 
   | username               | password   | error                        |
   | "cbatest123@gmail.com" | "cba@test" | "Invalid login or password." |
   | "cbatest7@gmail.com"   | "cba@123"  | "Invalid login or password." |
