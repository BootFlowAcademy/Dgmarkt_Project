@BFB1DGMAUT-12
Feature: My Account Order History

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ersoyde@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page
    When The user clicks to My Account button

  Scenario: The user should be able to see order history
    Given The user navigate to order history page
    When The user should be able to see order history page

  Scenario: Verify that tu user can access the order detail by clicking the view icon
    Given The user navigate to order history page
    When The user should be able to see order history page
    Given The user should be able to click on view icon
    When The user should be able to see order details

  Scenario: Verify that the user can re-order an item from their order history
    Given The user navigate to order history page
    When The user should be able to see order history page
    Given The user should be able to click on view icon
    When The user should be able to see order details
    And The user should be able to clicks reorder icon
    Then Verify that success message and the product is in the shopping cart


  Scenario: Verify that the user can return an item from their order history
    Given The user navigate to order history page
    When The user should be able to see order history page
    Given The user should be able to click on view icon
    When The user should be able to see order details
    And The user should be able to return button
    When The user should be able to see product returns page
    Then Verify that the id number of the returned product is correct
    When The user complete the form on the product returns page and clicks submit button
    Then The user should be able to see return request message



