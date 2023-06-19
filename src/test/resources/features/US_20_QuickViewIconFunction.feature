@BFB1DGMAUT-20
Feature: Quick View Function
  @wip
  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "soyeroli@yahoo.com" and "Kayserili1" and clicks login
    Then Verify that the user is on home page
  @wip
  Scenario: Displaying Quick View Icon on Hover
    Given The user is on the website's homepage
    When The user hovers the cursor over the category tab
    And The user clicks the "Health & Beauty" button
    And The user hovers over the first product on the "Health & Beauty" category page
    Then The quick view icon should be displayed

  //Scenario: Browsing a Product with Quick View


  Scenario: Adding Product to Wish List from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Add to Wish List" icon
    Then The product should be added to their wish list



  Scenario: Adding Product to Compare List from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Compare this Product" icon
    Then The product should be added to their compare list


  Scenario: Adding Product to Cart from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Add to Cart" button
    Then The product should be added to their cart


  Scenario: Increasing Product Quantity in Cart from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart



