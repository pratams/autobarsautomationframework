Feature: Login Action

Scenario: Sucessful login with valid credentials
Given User is on autobars BA login page
When User navigates to login page
And User enters Username and Password
Then Message displayed Welcome Ealing Council page 

Scenario: Sucessful logout 
When user Logout from the autobars application
Then Message displayed Welcome to the Valuation Office Agency