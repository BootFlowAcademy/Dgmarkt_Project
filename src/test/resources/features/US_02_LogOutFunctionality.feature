@BFB1DGMAUT-2
Feature: Log out Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "yavsev97@hotmail.com" and "ys198997" and clicks login
    Then Verify that the user is on home page

  Scenario: The user should be able to log out
    When The user clicks to My Account button
    And The user clicks to Logout button
    Then Verify that the user has securely terminated the session and sees the Account Logout box




