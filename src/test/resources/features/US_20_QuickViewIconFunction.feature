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
  Scenario: The user hovers over the product, they can see the quick view icon.
    When The user hovers the cursor over the category tab
    And The user clicks Health & Beauty button
    And  The user hovers over the first product on Health & Beauty page category
    Then Verify that Quick view icon can display

  Scenario: The user can browse the product when the user clicks the quick view icon



  Scenario: The user can add the product to their wish list when the user clicks Add to Wish List icon
  from the quick view popup.



  Scenario: The user can add the product to their compare list when the user clicks Compare this Product
  icon from the quick view popup



  Scenario: The user can add the product to their cart when the user clicks add to the cart button
  from the quick view popup



  Scenario: The user can increase the number of the products to add to the cart by filling the box
  from the quick view popup


















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

