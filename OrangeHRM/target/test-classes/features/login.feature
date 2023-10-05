Feature: Login functionality

Background:
Given I am on OrangeHRM Login page

Scenario: Login with valid credentials
When I enter username "admin"
And enter password "admin123"
And Click on login button
Then I am able to login in application

Scenario Outline: Login with invalid credentials
When I enter "<username>" and "<password>" to the application
And Click on login button
Then I'm getting error while login to the application

Examples:
| username | password |
| admin | admin |
| adm | adm12|



