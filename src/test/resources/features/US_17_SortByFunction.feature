
Feature: Sort By Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "hsena@gmail.com" and "fdsfdsfds" and clicks login

  Scenario: The user should be able to sort products
    When The user select a category.
    And The user look at the "Sort By" tab.
    Then The user clicks on all the options in the sort by tab in turn.
    And Verify that you can view all products in the correct order.

  @BFB1DGMAUT-17
  Scenario Outline: The user sees default sort on subcategories
    When The user hovers the the category tab
    And The user clicks "<subcategory>" button
    Then Verify that the sortby is displayed and selected default
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |