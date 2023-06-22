@BFB1DGMAUT-27
Feature: Contact us Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "y.berk@outlook.com" and "123xxx45" and clicks login
    Then Verify that the user is on home page

  Scenario: The user should be contuct the team correctly
    When The user click the contuct us button
    Then The user should be see their name and email
    Then The user enter the message
    Then The user click submit button
    Then Verify that the user see succsesfull message.

  Scenario: The user did not provide required message requirements
    When The user click the contuct us button
    Then The user should be see their name and email
    And The user enter message less then 10 char
    Then The user click submit button
    And Verify that the user see warning message.
    And The user click the contuct us button
    Then The user should be see their name and email
    And The user enter message above then 3000 char
    Then The user click submit button
    And Verify that the user see warning message.