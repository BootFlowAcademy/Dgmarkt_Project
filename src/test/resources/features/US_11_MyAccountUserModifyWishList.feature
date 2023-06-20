@BFB1DGMAUT-11
Feature: Popular Tags Function

  Scenario: The user logs in for login panel and The user logs in for my account login with valid credential and The user select Sub-Category tabs under the Category Module
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "serdarsaygin4312@outlook.com " and "Serdar1907" and clicks login
    Then Verify that the user is on home page
    When The user hovers the cursor over the category tab
    When The user navigates to Health & Beauty category
    Then Verify that user have seen Health and Beauty text
    When The user scroll down until NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER and clicked wish list icon
    Then Verify that Success: You have added message
    When The user hovers the cursor over the category tab
    When The user navigates to Televisions category
    Then Verify that user have seen Televisions text
    When The user scroll down until CELLO C1920FS 19" LED-BACKLIT LCD TV and clicked wish list icon
    Then Verify that Success: You have added message
    When The user hovers the cursor over the category tab
    When The user navigates to TV Accessories category
    Then Verify that user have seen TV Accessories text
    When The user scroll down until BELKIN ADAPTER CABLE and clicked wish list icon
    Then Verify that Success: You have added message
    When The user hovers the cursor over the category tab
    When The user navigates to Networking category
    Then Verify that user have seen Networking text
    When The user scroll down until BELKIN - NETWORK DEVICE MOUNTING BRACKET and clicked wish list icon
    Then Verify that Success: You have added message
    When The user clicked add to wish list icon on Base Page
    Then Verify that user is on the My wish list page
    When The user scrolls down and clicked the first product and add to cart button on Action section
    Then Verify that user can see Success: You have added message
    When The user clicked the second product and add to cart button on Action section
    Then Verify that user can see Success: You have added message
    When The user clicked the third product and add to cart button on Action section
    Then Verify that user can see Success: You have added message
    When The user clicked the fourth product and add to cart button on Action section
    Then Verify that user can see Success: You have added message
    When The user scrolls up and clicked cart icon on the Base Page
    Then Verify that added products can be seen by the users on the list
    When The user closes the cart page
    When The user able to remove first products on the Wish list
    When The user able to remove second products on the Wish list
    When The user able to remove third products on the Wish list
    When The user able to remove fourth products on the Wish list
    Then Verify that Your wish list is empty. message