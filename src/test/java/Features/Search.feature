
#Search function Test Feature file
Feature: Search Function
  User will be able to search valid product name
  
  Scenario: search Functional test by pressing Enter keybord key
   # Given user load google chrome and lunch  application
    When User enter valid product name in search bar 
    And  user press Enter keyboar key
    Then User should see result with the given product name title page