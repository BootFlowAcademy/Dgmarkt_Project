@BFB1DGMAUT-4
Feature: Currency Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ismailbahri@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page

  Scenario: The user logs in for my account login with valid credential
    Given The user clicks currency button
    Then The user click the Euro Button
    And The user closes cookies pop up
    Then verify that The user sees euro icon

  Scenario Outline: The user logs in for my account login with valid credential
    Given The user clicks currency button
    Then The user click the "<currencyName>" Button
    And The user closes cookies pop up
    Then verify that The user sees select currency icon
    Examples:
      | currencyName   |
      | Euro           |
      | Pound Sterling |
      | US Dollar      |