@Account @info @Regression  @SmokeTest

Feature: Retail Account page 

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'nadihashemih@gmail.com' and password 'Nadih@1234'
And User click on login button
And User should be logged in into Account
And User click on Account option

Scenario: Verify User can update Profile Information
When User click on Account option
And User update Name 'Nadiaaaaa' and Phone '0613840897'
And User click on Update button
Then user profile information should be updated

@info
Scenario: Verify User can Update password
When User click on Account option
And User enter below information
|previousPassword| newPassword|confirmPassword|
|Nadih@1234 |Nadih@12345 |Nadih@12345 |
And User click on Change Password button 
Then a message should be displayed 'Password Updated Successful'