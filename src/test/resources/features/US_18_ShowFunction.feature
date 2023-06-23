@BFB1DGMAUT-18
Feature: Show (number of products per page) Function

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "fatih.daskin40@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page

  @BFB1DGMAUT-116
  Scenario Outline:The user should be able to see that the Show: tab initially shows "12" subcategory
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks "<subcategory>" button
    And Verify that the Show: tab initially shows "12" in subcategory
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  @BFB1DGMAUT-122
  Scenario Outline:The user should be able toVerify that the user can replace the Show: tab with listOfNumber
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks "<subcategory>" button
    And Verify that the Show: tab initially shows "12" in subcategory
    Then The user can replace the Show: tab with listOfNumber in subcategory
      | 25  |
      | 50  |
      | 75  |
      | 100 |
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |