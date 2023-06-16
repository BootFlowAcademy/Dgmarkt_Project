@BFB1DGMAUT-18
Feature: Show (number of products per page) Function

  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "fatih.daskin40@gmail.com" and "123456" and clicks login
    Then Verify that the user is on home page

  Scenario:The user should be able to see that the Show: tab initially shows "12" in Health & Beauty
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks Health & Beauty button
    Then Verify that the Show: tab initially shows "12" in category of health&beauty

  Scenario:The user should be able to see that the Show: tab initially shows "12" in Televisions
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks Televisions button
    Then Verify that the Show: tab initially shows "12" in category of Televisions

  Scenario:The user should be able to see that the Show: tab initially shows "12" in TV Accessories
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks TVAccessories button
    Then Verify that the Show: tab initially shows "12" in category of TVAccessories

  Scenario:The user should be able to see that the Show: tab initially shows "12" in Networking
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks Networking button
    Then Verify that the Show: tab initially shows "12" in category of Networking

