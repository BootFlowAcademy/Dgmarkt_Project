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
    Given the user is on the website's homepage
    When the user hovers the cursor over the category tab
    And the user clicks the "Health & Beauty" button
    And the user hovers over the first product on the "Health & Beauty" category page
    Then the quick view icon should be displayed

  //Scenario: Browsing a Product with Quick View


  Scenario: Adding Product to Wish List from Quick View Popup
    Given the user is viewing a product in the quick view popup
    When the user clicks the "Add to Wish List" icon
    Then the product should be added to their wish list



  Scenario: Adding Product to Compare List from Quick View Popup
    Given the user is viewing a product in the quick view popup
    When the user clicks the "Compare this Product" icon
    Then the product should be added to their compare list


  Scenario: Adding Product to Cart from Quick View Popup
    Given the user is viewing a product in the quick view popup
    When the user clicks the "Add to Cart" button
    Then the product should be added to their cart


  Scenario: Increasing Product Quantity in Cart from Quick View Popup
    Given the user is viewing a product in the quick view popup
    When the user fills in the quantity box to increase the number of products
    Then the updated quantity should be reflected in the cart

















  us 7 den kopya düzenlenecek
  Scenario: The user should be able to see added product list by click cart icon
    When The user clicks cart icon button
    Then Verify that added product list is displayed
  Scenario: The user should be able to see product in cart list if add any product by click cart icon
    Given The user navigates to sub-category "Networking"
    And The user adds two products to the cart list names "ASUS ROG STRIX GS-AX3000" and "Belkin Secure Flip KVM Switch"
    When The user clicks cart icon button
    And The user clicks view cart button
    Then Verify that added products are 2 in CartPage

  //us 6 dan kopya
  Scenario: The user should be able to see products in the Wish List
    When The user navigates to Health & Beauty category
    And The user adds products to the wish list
    When The user navigates to My Wish List page using Wish Icon
    Then Verify that the user can see "BaByliss 3663U - Hair rollers" and "Capsule Plate 6pcs" on the wish list
  //

