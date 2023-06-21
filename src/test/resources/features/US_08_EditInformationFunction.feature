@BFB1DGMAUT-8
Feature: Edit Information Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "denizel@gmail.com" and "123456" and clicks login
    When Verify that the user is on home page
    And The user clicks on the my account button under the my account tab
    Then The user should be click on the edit my account tab on the page that opens

  Scenario: The user should be able to update their user information under the edit my account tab.
    Given The user should be able to make various changes on the page that opens
    When Verify that you can click the continue button


  Scenario Outline: Verify that the user is able to display the error message when entering or not entering invalid user information.
    Given The user clicks on the my account button under the my account tab
    When The user should be click on the edit my account tab on the page that opens
    And The user enters credentials "<firstName>", "<lastName>", "<eMail>", "<telephone>" in field
    Then Verify that warning message is displayed.

    Examples:
      | firstName | lastName    | eMail             | telephone   |
      | .         | Deniz       | denizel@gmail.com | 05322222222 |
      | 133245    | Deniz       | denizel@gmail.com | 05322222222 |
      | .         | .           | denizel@gmail.com | 05322222222 |
      | .         | .           | denizel@gmail.com | ...         |
      | Elif      | .           | denizel@gmail.com | 05322222222 |
      | Elif      | Deniz?      | denizel@gmail.com | 05322222222 |
      | Elif      | 26426426521 | denizel@gmail.com | 05322222222 |
      | Elif      | Deniz       | denizel@gmail.com | -.-         |









