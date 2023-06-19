
@BFB1DGMAUT-10
Feature: Add or Modify Address
  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "fredstone@dgmarkt.com" and "Fred12345" and clicks login
    When Verify that the user is on home page
    And The user clicks on the my account button under the my account tab
    Then The user should be click on the address book tab on the page that opens

  Scenario Outline: The user should be able to add new adress with valid credentials
    When The user clicks on new address button
    And The user clicks on "<FirstName>" box, "<LastName>" box,  "<Address1>" box,"<City>" box and "<PostCode>" box
    And The user select "<Country>" and "<RegionState>"
    Then The user click Continue button
    Then Verify that the user see verify message
    Examples:
      | FirstName            | LastName             | Address1                | City                 | PostCode | Country | RegionState |
      | Fred                 | Stone                | Mountain View Sunnyvale | San Jose             | 94043    | 223     | 3624        |
      | 1                    | 1                    | 111                     | 11                   | 11       | 215     | 3353        |
      | aaaa                 | aaaa                 | aaaa                    | aaaa                 | aaaa     | 81      | 1259        |
      | abcDEF///1234567@@@, | abcDEF///1234567@@@, | abcDEF///1234567@@@,    | abcDEF///1234567@@@, | abc1234, | 6       | 131         |

  Scenario Outline: The user should be able to add new adress with invalid credentials and no data
    When The user clicks on new address button
    And The user clicks on "<FirstName>" box, "<LastName>" box,  "<Address1>" box,"<City>" box and "<PostCode>" box
    And The user select "<Country>" and "<RegionState>"
    Then The user click Continue button
    Then Verify that the user see danger text
    Examples:
      | FirstName                           | LastName                            | Address1                                                                                                       | City                                                                                                           | PostCode      | Country | RegionState |
      |                                     |                                     |                                                                                                                |                                                                                                                |               |         |             |
      | 1                                   |                                     | 12                                                                                                             | 1                                                                                                              | 1             |         |             |
      | abcDEFghjk//--\1234567890@@@==***…, | abcDEFghjk//--\1234567890@@@==***…, | abcDEFghjk//--\1234567890@@@==***…,+++12345qwrpmabcDEFghjk//--\1234567890@@@==***…,+++12345qwrpmabcDEFghjk//-- | abcDEFghjk//--\1234567890@@@==***…,+++12345qwrpmabcDEFghjk//--\1234567890@@@==***…,+++12345qwrpmabcDEFghjk//-- | abc12345//+++ |         |             |

  Scenario Outline: The user should be able to update adress with valid credentials
    When The user clicks edit button
    And The user clears "<FirstName>" box, "<LastName>" box,  "<Address1>" box,"<City>" box and "<PostCode>" box for update
    And The user clicks on "<FirstName>" box, "<LastName>" box,  "<Address1>" box,"<City>" box and "<PostCode>" box
    And The user select "<Country>" and "<RegionState>"
    Then The user click Continue button
    Then Verify that the user see update verify message
    Examples:
      | FirstName | LastName | Address1         | City     | PostCode | Country | RegionState |
      | John      | Mountain | New Stone Street | Sao Alto | 32300    | 215     | 3353        |
