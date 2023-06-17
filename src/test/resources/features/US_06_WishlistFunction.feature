
Feature: Login Functionality

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "mail123@mail.com" and "password123" and clicks login
    Then Verify that the user is on home page
  @BFB1DGMAUT-06
    Scenario: The user should be able to see products in the Wish List
      When The user navigates to Health & Beauty category
      And The user adds products to the wish list
      When The user navigates to My Wish List page using Wish Icon
      Then Verify that the user can see "BaByliss 3663U - Hair rollers" and "Capsule Plate 6pcs" on the wish list