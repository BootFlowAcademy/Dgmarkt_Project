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
  Scenario: The user hovers over the product, they can see the quick View Icon.
    When The user hovers the cursor over the category tab
    And Verify that the sees  Sub-Category tabs under the Category Module
    And The user clicks <subcategory> button
    Then Verify that the user is on "<Sub-CategoryPage>"
    And The user hovers over the first product on the "Health & Beauty" page
    Then The quick view icon should be displayed

  Scenario: The user can browse the product when the user clicks the quick view Icon
    When The user hovers over the first product on the "Health & Beauty" Category
    And The user can see first product "BaByliss 3663U - Hair rollers"
    And The user clicks the quick view Icon button
    Then The user can browse product


  Scenario: Adding Product to Wish List from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Add to Wish List" Icon
    Then The product should be added to their wish list

  Scenario: Adding Product to Compare List from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Compare this Product" Icon
    Then The product should be added to their compare list

  Scenario: Adding Product to Cart from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user clicks the "Add to Cart" button
    Then The product should be added to their cart

  Scenario: Increasing Product Quantity in Cart from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart

