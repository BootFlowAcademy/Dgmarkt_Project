@BFB1DGMAUT-20
Feature: Quick View Function

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "soyeroli@yahoo.com" and "Kayserili1" and clicks login
    Then Verify that the user is on home page
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module

  Scenario Outline: The user hovers over the product, they can see the quick View Icon.
    When The user clicks on "<CategoryName>", Verify that the user sees "<CategoryNameText>" and scrolls down
    Then The user hovers one product from every category to the quick view Icon
    Examples:
      | CategoryName    | CategoryNameText |
      | Health & Beauty | Health & Beauty  |
      | Televisions     | Televisions      |
      | TV Accessories  | TV Accessories   |
      | Networking      | Networking       |

  Scenario: The user can browse the product when the user clicks the quick view Icon
    Given The user clicks one product from every category to the quick view Icon
    Then Verify the user should see the product page

  Scenario: Adding Product to Wish List from Quick View Popup
    Given The user clicks the Add to Wish List Icon
    When The product should be added to the wish list
    Then Verify that Success: You have added the product to your wish list!

  Scenario: Adding Product to Compare List from Quick View Popup
    Given The user clicks the compare this product to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added the product to your shopping cart!

  Scenario: Adding Product to Cart from Quick View Popup

    Given The user clicks the Add to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added the product to your shopping cart!

  Scenario: Increasing Product Quantity in Cart from Quick View Popup
    Given The user is viewing a product in the quick view popup
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart




