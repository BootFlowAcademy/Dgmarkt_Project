@BFB1DGMAUT-21
Feature: Login Functionality

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "bootdev@bootflow.academy" and "12341234" and clicks login

  @BFB1DGMAUT-132
  Scenario Outline:  The user should be able to see products wishlist icon and add to wishlist box
    Then The user hovers the cursor over the category tab
    When The user clicks on "<CategoryName>", Verify that the user sees "<CategoryNameText>" and scrolls down
    Then The user adds six products every category to the wish list
    Examples:
      | CategoryName    | CategoryNameText |
      | Health & Beauty | Health & Beauty  |
      | Televisions     | Televisions      |
      | TV Accessories  | TV Accessories   |
      | Networking      | Networking       |
    @BFB1DGMAUT-133
    Scenario: The user verifies wishlist box and clears the wishlist
      And The user verifies contents of the wishlist box
      Then The user clears contents of the wishlist box