Feature: Login Functionality

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon

  @BFB1DGMAUT-1
    Scenario: The user logs in for my account login with valid credential
    When The user clicks the login under the my account
    And The user enters account credentials "ortakoyadnan@gmail.com" and "1234" and clicks login
    Then Verify that the user is on home page


  Scenario: The user logs in for my account login with unvalid credential




