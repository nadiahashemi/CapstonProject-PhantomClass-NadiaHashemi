@Account @Regression @SmokeTest
Feature: Retail Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nadihashemih@gmail.com' and password 'Nadih@12345'
    And User click on login button
    And User should be logged in into Account

  @pofile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Nadiaaaaa' and Phone '0613840897'
    And User click on Update button
    Then user profile information should be updated

  @info
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Nadih@1234       | Nadih@12345 | Nadih@12345     |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @payment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard      | expirationMonth | expirationYear | securityCode |
      | 0123456788111013 | Jackmanaanaaaai |               3 |           2027 |          969 |
    And User click on Add your card button
    Then a message should be display ‘Payment Method added successfully’

  @updateCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Card option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0889630829301674 | Jack       |               5 |           2029 |          962 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on Card option display
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city    | state   | zipCode |
      | Canada  | Nadia    |  6137460032 | 11Tapscot     | 918 | Toronto | Ontario |   12345 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city    | state   | zipCode  |
      | Canada  | Nadi     |  9876027384 | 23tapscot     | 665 | Toronto | Ontario | 12345    |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @remove_address
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
