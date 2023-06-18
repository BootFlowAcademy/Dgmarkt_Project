@BFB1DGMAUT-12
Feature: My Account Order History

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ersoyde@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page
    When The user clicks to My Account button

    Scenario: The user should be able to see order history
      Given The user navigate to order history page
      When Verify that the user order "314" history