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


  Scenario: The user hovers over the product, they can see the quick View Icon.
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks "<subcategory>" button
    Then Verify that the user is on "<Sub-CategoryPage>"
    When The user clicks the "Health & Beauty" Category button
    And The user hovers over the first product on the "Health & Beauty" page
    And The user can see first product "BaByliss 3663U - Hair rollers"
    Then The quick view icon should be displayed



