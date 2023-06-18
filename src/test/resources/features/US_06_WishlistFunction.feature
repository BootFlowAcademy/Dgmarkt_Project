@BFB1DGMAUT-6
Feature: Wish List Function

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "mail123@mail.com" and "password123" and clicks login
    Then Verify that the user is on home page

  Scenario: The user should be able to see products in the Wish List
    When The user navigates to Health & Beauty category
    And The user adds products to the wish list
    When The user navigates to My Wish List page using Wish Icon
    Then Verify that the user can see "BaByliss 3663U - Hair rollers" and "Capsule Plate 6pcs" on the wish list

  Scenario: The user should be able to add products to Cart from Wish List
    Given The user navigates to My Wish List page using Wish Icon
    When The user adds first item to cart using Add to Cart button
    Then Verify that the user gets "Success" pop up
    When The user adds second item to cart using Add to cart Button
    Then Verify that the user gets "Success" pop up
    Then Verify that the user sees the products in the Cart

    Scenario: The user should be able to remove products from Wish List
    Given The user navigates to My Wish List page using Wish Icon
    When The user removes the first item using Remove button
    Then Verify the user sees "Success: You have modified your wish list!" alert
    When The user removes the second item using Remove button
    Then Verify the user sees "Success: You have modified your wish list!" alert
    Then Verify the wish list is empty and the user sees "Your wish list is empty." text