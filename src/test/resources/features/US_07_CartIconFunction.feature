Feature: Cart Icon Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "onuraudit@gmail.com" and "test.12345" and clicks login
    Then Verify that the user is on home page

  @BFB1DGMAUT-7
  Scenario: The user should be able to see added product list by click car icon
    When The user clicks cart icon button
    Then Verify that added product list is displayed