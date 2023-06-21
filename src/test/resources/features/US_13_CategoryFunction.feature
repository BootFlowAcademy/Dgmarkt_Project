@BFB1DGMAUT-13
Feature: Category Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "AsimK@bootflow.com" and "1234" and clicks login
  @BFB1DGMAUT-37
  Scenario Outline: The user select Sub-Category tabs under the Category Module <subcategory>
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks "<subcategory>" button
    Then Verify that the user is on "<Sub-CategoryPage>"
    Examples:
      | subcategory     | Sub-CategoryPage |
      | Health & Beauty | Health & Beauty  |
      | Televisions     | Televisions      |
      | TVAccessories   | TV Accessories   |
      | Networking      | Networking       |
@BFB1DGMAUT-38
  Scenario: The user goes to Category Module
    Given The user click the Category
    Then Verify that the user is on Category Module



