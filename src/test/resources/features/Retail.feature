Feature: Retail Page application

@test
  Scenario: verify user can search a product
    Given: user is on retail website 
    When: user search for 'Pokemon'item 
    Then: product should be displayed
