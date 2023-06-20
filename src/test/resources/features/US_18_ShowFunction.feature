@BFB1DGMAUT-18
Feature: Show (number of products per page) Function

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "fatih.daskin40@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page


  Scenario Outline:The user should be able toVerify that the user can replace the Show: tab with <number>
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks <subcategory> button
    And Verify that the Show: tab initially shows "12" in <subcategory>
    Then The user can replace the Show: tab with <number> in <subcategory>
    Examples:
      | subcategory     | number |
      | Health & Beauty | "25"   |
      | Televisions     | "50"   |
      | TVAccessories   | "75"   |
      | Networking      | "100"  |


