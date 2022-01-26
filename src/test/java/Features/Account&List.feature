# Account and list function Test Feature file
Feature: Functional test
  User will be able move mouse and able to click account and List option
  
  Scenario Outline: Functional test by clicking mouse button
    Given user load google chrome and lunch  application
    When User move mouse curser Account and lists  dynamic droupdown menu   
    And  user press click "<link>" account and list options
    Then User should see result of link page URL
    And  user verify "<Titlepage>" Titlepage
  
  Examples: 
      | link|Titlepage|
      | Account|Your Account| 
      |Create a List|Your List|
      |Find a List or Registry|Amazon Registry & Gifting|
      |AmazonSmile Charity Lists|AmazonSmile: You shop. Amazon gives.|
      |Watchlist|Amazon Sign-In|
