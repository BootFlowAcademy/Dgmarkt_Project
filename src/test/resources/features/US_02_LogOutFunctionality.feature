@BFB1DGMAUT-2
Feature: Log out Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "yavsev97@hotmail.com" and "ys198997" and clicks login
    Then Verify that the user is on home page
  @BFB1DGMAUT-57
  Scenario: The user should be able to log out
    When The user clicks to My Account button
    And The user clicks to Logout button
    Then Verify that the user has securely terminated the session and sees the Account Logout box
  @BFB1DGMAUT-59
  Scenario: The user should be able to log out with Exit Button (X)
    When The user clicks to Exit Button (X)  for the browser close
    Given The user navigate to web site
    Then The user verify that current browser is not old browser
    Then Verify that the user has securely terminated the session and the login panel page is open
  @BFB1DGMAUT-60
  Scenario: The user cannot re-login with "back to page"  icon in browser, if the user has successfully logged out
    When The user clicks to My Account button
    And The user clicks to Logout button
    Then Verify that the user has securely terminated the session and sees the Account Logout box
    And  The user clicks to Go Back Button
    Then Verify that successfully logged out
  @BFB1DGMAUT-61
  Scenario: The user should be automatic logout when there is no movement on the site for a certain period of time
    When The user waits 10 minutes without any movement on the site
    And  The user clicks to Refresh Button
    And The user clicks to My Account button
    Then Verify that automatic logged out of the site
  @BFB1DGMAUT-62
  Scenario: The user should be see the session is not active when click to go back after 10 minutes if navigate to a new web site
    When The user navigates to "https://www.google.com/"
    Then Verify that the "https://www.google.com/" page opens
    And The user  waits  10 minutes and clicks to *Click to go back button*
    Then Verify that automatic logged out of the site