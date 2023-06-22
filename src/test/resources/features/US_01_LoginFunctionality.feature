@BFB1DGMAUT-1
Feature: Login Functionality

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
  @BFB1DGMAUT-66
  Scenario: The user logs in for my account login with valid credential
    When The user clicks the login under the my account
    And The user enters account credentials "ortakoyadnan@gmail.com" and "1234" and clicks login
    Then Verify that the user is on home page
  @BFB1DGMAUT-68
  Scenario Outline: The user logs in for my account login with different credential
    When The user clicks the login under the my account
    And The user enters account credentials "<email>" and "<password>" and clicks login
    Then Verify that the error message is displayed
    Examples:
      | email                  | password    |
      |                        |             |
      |                        | 1234        |
      | ortakoyadnan@gmail.com |             |
      | invalidemail@gmail.com | 1234        |
      | ortakoyadnan@gmail.com | invalid1234 |