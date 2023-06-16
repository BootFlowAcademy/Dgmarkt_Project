@BFB1DGMAUT-7
Feature: Cart Icon Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "onuraudit@gmail.com" and "test.12345" and clicks login
    Then Verify that the user is on home page

  Scenario: The user should be able to see added product list by click cart icon
    When The user clicks cart icon button
    Then Verify that added product list is displayed

  Scenario: The user should be able to see product in cart list if add any product by click cart icon
    Given The user navigates to sub-category "Networking"
    And The user adds two products to the cart list names "ASUS ROG STRIX GS-AX3000" and "Belkin Secure Flip KVM Switch"
    When The user clicks cart icon button
    And The user clicks view cart button
    Then Verify that added products are 2 in CartPage