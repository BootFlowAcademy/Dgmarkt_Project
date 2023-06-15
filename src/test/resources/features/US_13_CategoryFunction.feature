@BFB1DGMAUT-13
Feature: Category Functionality

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "AsimK@bootflow.com" and "1234" and clicks login
    Then Verify that the user is on home page

  Scenario: The user select Sub-Category tabs under the Category Module
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module

  Scenario: The user goes to Category Module
    Given The user click the Category
    Then Verify that the user is on Category Module
