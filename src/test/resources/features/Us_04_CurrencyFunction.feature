Feature: Currency Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ismailbahri@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page

  Scenario: The user logs in for my account login with valid credential
    Given The user clicks currency button
    Then The user click the Euro Button
    And The user closes cookies pop up
    Then verify that The user sees euro icon

  @BFB1DGMAUT-4
  Scenario Outline: The user logs in for my account login with valid credential
    Given The user clicks currency button
    Then The user click the "<currencyName>" Button
    And The user closes cookies pop up
    Then verify that The user sees select currency icon "<moneyicon>"
    Examples:
      | currencyName   | moneyicon |
      | Euro           | €         |
      | Pound Sterling | £         |
      | US Dollar      | $         |



  Scenario Outline: The user change currency CartPage
    Given The user click the "<currencyName>" Button
    And The user closes cookies pop up
    Then  The user navigates to sub-category "Networking"
    And The user adds two products to the cart list names "ASUS ROG STRIX GS-AX3000" and "Belkin Secure Flip KVM Switch"
    When The user clicks cart icon button
    Then Verify that products are visible dollar
    Examples:
      | currencyName |
      | US Dollar    |
