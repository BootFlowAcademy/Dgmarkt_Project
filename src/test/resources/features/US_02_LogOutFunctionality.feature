
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

  @BFB1DGMAUT-2
  Scenario: The user should be able to log out with Exit Button (X)
    When The user clicks to Exit Button (X)  for the browser close
    Given The user navigate to web site
    Then The user verify that current browser is not old browser
    Then Verify that the user has securely terminated the session and the login panel page is open

  Scenario: The user cannot re-login with "back to page"  icon in browser, if the user has successfully logged out
    When The user clicks to My Account button
    And The user clicks to Logout button
    Then Verify that the user has securely terminated the session and sees the Account Logout box
    And  The user clicks to Go Back Button
    Then Verify that the user can not be login by clicking the step back button after successfully logged out

  Scenario: The user should be automatic logout when there is no movement on the site for a certain period of time
    When The user clicks to Refresh Button after wait 10 minutes when there is no movement on the site
    Then Verify that the page was refresh
    And The user clicks to My Account button
    Then Verify that Automatic logged out of the site for security reasons when there is no movement on the site for a certain period of time

  Scenario: Verify that when we go to a new address from site and click to "click to go back"  icon after 10 minutes, it should not be possible to log in to the account
    When The user writes in address bar "www.google.com" and press enter
    Then Verify that the "www.google.com" page opens
    And The user  waits  "10 minutes" and clicks to "click to go back"  icon
    Then verify that   https://dgmarkt.com the account is not active