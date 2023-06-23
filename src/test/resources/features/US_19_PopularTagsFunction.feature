@BFB1DGMAUT-19
Feature: Popular Tags Function

  Background: The user logs in for login panel and The user logs in for my account login with valid credential and The user select Sub-Category tabs under the Category Module
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "alex_wedon@hotmail.com" and "1234" and clicks login
    When The user hovers the cursor over the category tab
  @BFB1DGMAUT-102
  Scenario Outline: The user checks the popular tags tabs to see if there are any matching products
    When The user clicks on "<CategoryName>" and Verify that the user sees "<CategoryNameText>" and scrolls down
    Then Verify that the user sees Popular Tags
    When The user clicks Amazon button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Apple button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the IPhone button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Headphone button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Beats button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Bluetooth button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Speaker button and clicks Search button
    Then Verify that the sees Products meeting the search criteria text
    When The user clicks the back button and clicks the Bose button and clicks Search button and scrolls down
    Then Verify that the sees BOSE CONTROLSPACE WP22B-D DANTE text
    Examples:
      | CategoryName    | CategoryNameText |
      | Health & Beauty | Health & Beauty  |
      | Televisions     | Televisions      |
      | TV Accessories  | TV Accessories   |
      | Networking      | Networking       |