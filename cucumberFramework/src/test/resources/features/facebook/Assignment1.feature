Feature: Login Facebook with different user

Scenario Outline: Login to facebook.Username and Password should be on a variable we can change.Post status Hello World

Given user is on the Login page URL "https://www.facebook.com/"
When user enter username as "<username>"
Then user enter password as "<password>"
And click on login button
Then user logged in
And user post status as "Hello World"
Then close the driver

 Examples: 
      | username | password |
      | akash750013@gmail.com | Akash1808 |
      | akashsri1808@gmail.com | Test@123 |
