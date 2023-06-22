Feature: Product Compare Function

  Background: The user logs in valid credentials and open homepage
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "nezih@bootflow.academy" and "12345" and clicks login
  @BFB1DGMAUT-16
  Scenario Outline: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare
    When The user hovers the "<Menu>" and click "<Submenu>"
    And The user clicks Product Compare button
    Then Verify that the user is on Comparison Page
    Examples:
      | Menu     | Submenu         |
      | Category | Health & Beauty |
      | Category | Televisions     |
      | Category | TV Accessories  |
      | Category | Networking      |
  @BFB1DGMAUT-16
  Scenario: The user should be able to see the Products they want to compare on the Product Comparison page
    When The user navigates to Health & Beauty category
    And The user adds products to the compare page
    And The user clicks Product Compare button
    Then Verify that the user can see "BaByliss 3663U - Hair rollers" and "Capsule Plate 6pcs" on the Comparison Page
  @BFB1DGMAUT-16
  Scenario: The user should be able to add 5 products to the Product Comparison page
    When The user navigates to Health & Beauty category
    And The user adds five products to the compare page
    Then Verify that the compare page button appears as "Compare Product (5)"
  @BFB1DGMAUT-16
  Scenario: The user should be able to add products to Cart from Comparison Page
    When The user navigates to Health & Beauty category
    And The user adds products to the compare page
    And The user clicks Product Compare button
    And The user adds the product to cart using Add to Cart button
    Then Verify that the user sees the product in the Cart
  @BFB1DGMAUT-16
  Scenario: The user should be able to remove products to Cart from Comparison Page
    When The user navigates to Health & Beauty category
    And The user adds products to the compare page
    And The user clicks Product Compare button
    And The user removes the product to cart using Remove button
    Then Verify that the user removes the product in the Cart




