@Account  @Regression  @SmokeTest

Feature: Retail Account page 

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'nadihashemih@gmail.com' and password 'Nadih@1234'
And User click on login button
And User should be logged in into Account

Scenario: Verify User can update Profile Information
When User click on Account option
And User update Name ‘Nadiaa’ and Phone ‘61384099907’
And User click on Update button
Then user profile information should be updated
