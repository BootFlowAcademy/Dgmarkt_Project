Feature: Edit Information Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "eliftest@gmail.com" and "123456" and clicks login
    When Verify that the user is on home page
    And The user clicks on the my account button under the my account tab
    Then The user should be click on the edit my account tab on the page that opens


  @BFB1DGMAUT-8
  Scenario: The user should be able to update their user information under the edit my account tab.
    Given The user should click on edit my account tab
    When The user should be able to make various changes on the page that opens
    Then Verify that you can click the continue button
