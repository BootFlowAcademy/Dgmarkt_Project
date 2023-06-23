@BFB1DGMAUT-14
Feature:PRICE Slider Function
  Background: The user logs in for login panel
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
  @BFB1DGMAUT-64
  Scenario:The user should scroll the price slider and bring the products in the desired price range at Health & Beauty category page
    Given The user navigates to Health & Beauty category
    When The user scroll the price slider
    Then The user click show hundred product button
    And Verify that bring the products in the desired price range
  @BFB1DGMAUT-70
  Scenario:The user should scroll the price slider and bring the products in the desired price range at Televisions category page
    Given The user hovers the cursor over the category tab
    When The user clicks Televisions button
    Then The user scroll the price slider
    And The user click show hundred product button
    And Verify that bring the products in the desired price range
  @BFB1DGMAUT-71
  Scenario:The user should scroll the price slider and bring the products in the desired price range at TV Accessories category page
    Given The user hovers the cursor over the category tab
    When The user clicks TVAccessories button
    Then The user scroll the price slider
    And The user click show hundred product button
    And Verify that bring the products in the desired price range
  @BFB1DGMAUT-72
  Scenario:The user should scroll the price slider and bring the products in the desired price range at Networking category page
    Given The user hovers the cursor over the category tab
    When The user clicks Networking button
    Then The user scroll the price slider
    And The user click show hundred product button
    And Verify that bring the products in the desired price range