@BFB1DGMAUT-5
Feature: Search Icon Functıon

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "feyzalemana@gmail.com" and "2345" and clicks login
    Then Verify that the user is on home page

  Scenario:The user should be able to search for products in the search button.
    When The user clicks search button
    And The user enters "televısıon" in search button
    Then Verify that  user confirms that they see the product they are looking for "televısıon"

  Scenario Outline:The user should be able to search for products in the search button.
    When The user clicks search button
    And The user enters "<searchword>" in search button
    Then Verify that user get search message "<searchmessage>"
    Examples:
      | searchword | searchmessage |
      | chair      | There is no product that matches the search criteria. |
      | masa      | There is no product that matches the search criteria. |



