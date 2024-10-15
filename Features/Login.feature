Feature: Login page Automation of saucedemo App
Scenario: Check login is successful with valid credential
Given User is on login page
When User enter valid username and password
And Click on login Button
Then User is navigate to Home page
And close the browser
