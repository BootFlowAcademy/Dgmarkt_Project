@BFB1DGMAUT-22
Feature: Login Functionality

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up

  Scenario Outline:  The user should be able to see products in the Compare List
    Then The user hovers the cursor over the category tab
    When The user clicks on "<CategoryName>", Verify that the user sees "<CategoryNameText>" and scrolls down.
    Then The user adds eight products every category to the compare list
    And The user verifies contents of the compare box
    Then The user sees four products in the compare box

    Examples:
      | CategoryName    | CategoryNameText |
      | Health & Beauty | Health & Beauty  |
      | Televisions     | Televisions      |
      | TV Accessories  | TV Accessories   |
      | Networking      | Networking       |
