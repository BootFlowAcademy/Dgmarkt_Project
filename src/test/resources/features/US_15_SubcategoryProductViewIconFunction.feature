@BFB1DGMAUT-15
Feature: Subcategory product view function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "sdeniz@gmail.com" and "12345" and clicks login

  Scenario Outline: The user should be able to choose view type on subcategory "<subcategory>"
    When The user navigates to sub-category by "<subcategory>"
    And The user click the "2" product view button
    Then Verify that the user sees  "active" choose view "2"
    And The user click the "3" product view button
    Then Verify that the user sees  "active" choose view "3"
    And The user click the "4" product view button
    Then Verify that the user sees  "active" choose view "4"
    And The user click the "List" product view button
    Then Verify that the user sees  "active" choose view "List"
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |
