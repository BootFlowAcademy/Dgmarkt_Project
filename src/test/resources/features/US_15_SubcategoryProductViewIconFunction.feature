@BFB1DGMAUT-15
Feature: Subcategory product view function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "ders@dgmarkt.com" and "2574dGlogin" and clicks login


  Scenario Outline: The user goes to category module
    When The user hovers the cursor over the category tab
    Then Verify that the sees  Sub-Category tabs under the Category Module
    When The user clicks "<subcategory>" button
    #And The user click the "<viewProductBtn>" product view button
   # Then Verify that the user change the view to "<seeProduct>" products side by side
    Examples:
      | subcategory     | viewProductBtn | seeProduct |
      | Health & Beauty | 2              | active|
      | Televisions     | 3              | active           |
      | TVAccessories   | 4              | active           |
      | Networking      | List           |  active          |
