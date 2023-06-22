@BFB1DGMAUT-7
Feature: Cart Icon Function

  Background: The user is on home page
    Given The user navigate to web site
    And The user enters login panel credential and clicks login
    And The user closes cookies pop up
    And The user clicks the login under the my account
    And The user enters account credentials "onuraudit@gmail.com" and "test.12345" and clicks login
    And The user navigates to sub-category "Networking"
    And The user adds two products to the cart list names "ASUS PCE-AC51 - network adapter" and "ASUS PCE-AX58BT - network adapter"

  @BFB1DGMAUT-41
  Scenario: The user should be able to see added product list by click cart icon
    When The user clicks cart icon button
    Then Verify that added product list is displayed

  @BFB1DGMAUT-43
  Scenario: The user should be able to see product in cart list if add any product by click cart icon
    When The user clicks cart icon button
    And The user clicks view cart button
    Then Verify that added products are 2 in CartPage

  @BFB1DGMAUT-44
  Scenario: The user should be able to go to the Checkout page from the cart icon and complete the checkout
    Given The user clicks cart icon button
    And The user clicks view cart button
    When The user clicks Checkout button
    And The user selects a new address for billing details and clicks continue with credentials
      | firstname    | onur        |
      | lastname     | bootflow    |
      | company      | sdet        |
      | address1     | lion street |
      | city         | midyat      |
      | postcode     | 47510       |
      | country      | Turkey      |
      | region-state | Mardin      |
    And The user selects a new address for delivery details and clicks continue with credentials
      | firstname    | onur        |
      | lastname     | bootflow    |
      | company      | sdet        |
      | address1     | lion street |
      | city         | midyat      |
      | postcode     | 47510       |
      | country      | Turkey      |
      | region-state | Mardin      |
    And The user adds comment about his order "Everything is ok!" and clicks continue for delivery method
    And The user adds comment about his order "Thanks! Everything is ok!" and clicks checkbox to agree Terms and Conditions and clicks continue
    And The user checks and clicks confirm order
    Then The user is on success page

  @BFB1DGMAUT-45
  Scenario: The user should be able to change quantities of added product on cart page
    Given The user clicks cart icon button
    And The user clicks view cart button
    When The user changes first added products quantity to "3"
    Then the user verify that first added products quantity is "3"

  @BFB1DGMAUT-74
  Scenario: The user sees how many product in cart near Cart Icon when user login
    When The user logs out and closes the driver
    And The user navigate to web site again
    And The user enters account credentials "onuraudit@gmail.com" and "test.12345" again
    Then Verify that added products are "2" near the cart icon

  @BFB1DGMAUT-75
  Scenario: The user should not be able continue to checkout by invalid billing details firstname and lastname
    Given The user clicks cart icon button
    And The user clicks view cart button
    When The user clicks Checkout button
    And The user selects a new address for billing details and clicks continue with credentials
      | firstname    | 2           |
      | lastname     | _           |
      | company      | sdet        |
      | address1     | lion street |
      | city         | midyat      |
      | postcode     | 47510       |
      | country      | Turkey      |
      | region-state | Mardin      |
    Then Verify that the user not able to continue to delivery details