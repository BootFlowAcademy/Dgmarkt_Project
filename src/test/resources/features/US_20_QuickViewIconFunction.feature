@BFB1DGMAUT-20
Feature: Quick View Function

  Scenario: The user logs in for login panel and The user logs in for my account login with valid credential and The user select Sub-Category tabs under the Category Module
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "soyeroli@yahoo.com" and "Kayserili1" and clicks login
    Then Verify that the user is on home page
    When The user hovers the cursor over the category tab
    When The user navigates to Health & Beauty category
    Then Verify that user have seen Health and Beauty text
    When The user scroll down until NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER and clicked quick view icon
    Then Verify the user should see the product page
    Given The user clicks the Add to Wish List Icon

    Then Verify that Success: You have added message
    Given The user clicks the compare this product Icon
    When The product should be added to product comparison!
    Then Verify that Success: You have added message
    Given The user clicks the Add to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added message
    Given The user clicks the quantity box
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart
    Then Verify that Success: You have added message
    When The user hovers the cursor over the category tab
    When The user navigates to Televisions category
    Then Verify that user have seen Televisions text
    When The user scroll down until CELLO C1920FS 19" LED-BACKLIT LCD TV and clicked quick view icon
    Then Verify the user should see the product page
    Given The user clicks the Add to Wish List Icon
    When The product should be added to the wish list
    Then Verify that Success: You have added message
    Given The user clicks the compare this product Icon
    When The product should be added to product comparison!
    Then Verify that Success: You have added message
    Given The user clicks the Add to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added message
    Given The user clicks the quantity box
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart
    Then Verify that Success: You have added message
    When The user navigates to TV Accessories category
    Then Verify that user have seen TV Accessories text
    When The user scroll down until BELKIN ADAPTER CABLE and clicked quick view icon
    Then Verify the user should see the product page
    Given The user clicks the Add to Wish List Icon
    When The product should be added to the wish list
    Then Verify that Success: You have added message
    Given The user clicks the compare this product Icon
    When The product should be added to product comparison!
    Then Verify that Success: You have added message
    Given The user clicks the Add to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added message
    Given The user clicks the quantity box
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart
    Then Verify that Success: You have added message
    When The user navigates to Networking category
    Then Verify that user have seen Networking text
    When The user scroll down until BELKIN - NETWORK DEVICE MOUNTING BRACKET and clicked quick view icon
    Then Verify the user should see the product page
    Given The user clicks the Add to Wish List Icon
    When The product should be added to the wish list
    Then Verify that Success: You have added message
    Given The user clicks the compare this product Icon
    When The product should be added to product comparison!
    Then Verify that Success: You have added message
    Given The user clicks the Add to cart Icon
    When The product should be added to cart
    Then Verify that Success: You have added message
    Given The user clicks the quantity box
    When The user fills in the quantity box to increase the number of products
    Then The updated quantity should be reflected in the cart
    Then Verify that Success: You have added message
