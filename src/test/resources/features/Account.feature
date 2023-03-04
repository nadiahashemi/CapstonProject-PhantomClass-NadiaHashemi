@Account  @Regression  @SmokeTest

Feature: Retail Account page 

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'EmailValue' and password 'PasswordValue'
And User click on login button
And User should be logged in into Account

Scenario: Verify User can update Profile Information
When User click on Account option
And User update Name ‘NameValue’ and Phone ‘PhoneValue’
And User click on Update button
Then user profile information should be updated
