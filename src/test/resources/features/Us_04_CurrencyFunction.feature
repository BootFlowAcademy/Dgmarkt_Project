 @BFB1DGMAUT-4
Feature: Currency Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ismailbahri@gmail.com" and "123456" and clicks login
  @BFB1DGMAUT-51
  Scenario: The user logs in for my account login with valid credential
    Given The user clicks currency button
    Then The user click the Euro Button
    And The user closes cookies pop up
    Then verify that The user sees euro icon
  @BFB1DGMAUT-53
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
  @BFB1DGMAUT-54
  Scenario Outline: The user change currency CartPage
    Given The user navigates to sub-category "Networking"
    And The user adds two products to the cart list names "ASUS ROG STRIX GS-AX3000" and "Belkin Secure Flip KVM Switch"
    And The user clicks cart icon button
    And The user clicks view cart button
    Given The user clicks currency button
    Then The user click the "<currencyName>" Button
    Then Verify that total price is in expected currency "<expectedicon>"
    Examples:
      | currencyName   | expectedicon |
      | Euro           | €            |
      | Pound Sterling | £            |
      | US Dollar      | $            |
  @BFB1DGMAUT-55
    Scenario Outline: The user completes his/her purchase with the currency his/her choice
      Given The user navigates to sub-category "Networking"
      And The user adds two products to the cart list names "ASUS ROG STRIX GS-AX3000" and "Belkin Secure Flip KVM Switch"
      And The user clicks cart icon button
      And The user clicks view cart button
      Given The user clicks currency button
      Then The user click the "<currencyName>" Button
      When The user clicks Checkout button
      And The user clicks continue for billing details with exist credentials
      And The user clicks continue for delivery details with exist credentials
      And The user adds comment about his order "Everything is ok!" and clicks continue for delivery method
      And The user adds comment about his order "Thanks! Everything is ok!" and clicks checkbox to agree Terms and Conditions and clicks continue
      Then Verify that confirm order total price is in expected currency "<expectedicon>"
      Examples:
        | currencyName   | expectedicon |
        | Euro           | €            |
        | Pound Sterling | £            |
        | US Dollar      | $            |