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

  @BFB1DGMAUT-10

  Scenario Outline: The user should be able to add new adress
    When The user clicks on new address button
    And The user clicks on "<FirstName>" box, "<LastName>" box,  "<Address1>" box,"<City>" box and "<PostCode>" box
    Then The user click Continue button
    Then Verify that the user see "<TextMessage>"

    Examples:
      | FirstName | LastName | Address1 | City | PostCode | TextMessage                            |

      |           |          |          |      |          | First Name must be between 1 and 32 characters! |
     # | Fred                                | Stone                               | Mountain View Sunnyvale             | San Jose                            | 94043       | Your address has been successfully added        |


    #  |                                     |                                     |                                     |                                     |             | Your address has been successfully added        |
    #   |                                     | Stone                               | Mountain View Sunnyvale             | San Jose                            | 94043       | First Name must be between 1 and 32 characters! |
    #  | 1                                   | Stone                               | Mountain View Sunnyvale             | San Jose                            | 94043       | Your address has been successfully added        |
    #   | aaa                                 | Stone                               | Mountain View Sunnyvale             | San Jose                            | 94043       | Your address has been successfully added        |
       #  | abcDEFghjk//--\1234567890@@@==***…, | Stone                               | Mountain View Sunnyvale             | San Jose                            | 94043       | First Name must be between 1 and 32 characters! |

   #    | Fred                                |                                     | Mountain View Sunnyvale             | San Jose                            | 94043       | Last Name must be between 1 and 32 characters!  |
    #   | Fred                                | 1                                   | Mountain View Sunnyvale             | San Jose                            | 94043       | Address must be between 3 and 128 characters!   |
   #    | Fred                                | aaa                                 | Mountain View Sunnyvale             | San Jose                            | 94043       | City must be between 2 and 128 characters!      |
    #   | Fred                                | abcDEFghjk//--\1234567890@@@==***…, | Mountain View Sunnyvale             | San Jose                            | 94043       | Postcode must be between 2 and 10 characters!   |

   #    | Fred                                | Stone                               |                                     | San Jose                            | 94043       | Last Name must be between 1 and 32 characters!  |
  #     | Fred                                | Stone                               | 1                                   | San Jose                            | 94043       | Address must be between 3 and 128 characters!   |
   #    | Fred                                | Stone                               | aaa                                 | San Jose                            | 94043       | City must be between 2 and 128 characters!      |
   #    | Fred                                | Stone                               | abcDEFghjk//--\1234567890@@@==***…, | San Jose                            | 94043       | Postcode must be between 2 and 10 characters!   |

    #   | Fred                                | Stone                               | Mountain View Sunnyvale             |                                     | 94043       | Last Name must be between 1 and 32 characters!  |
   #    | Fred                                | Stone                               | Mountain View Sunnyvale             | 1                                   | 94043       | Address must be between 3 and 128 characters!   |
   #    | Fred                                | Stone                               | Mountain View Sunnyvale             | aaa                                 | 94043       | City must be between 2 and 128 characters!      |
     #  | Fred                                | Stone                               | Mountain View Sunnyvale             | abcDEFghjk//--\1234567890@@@==***…, | 94043       | Postcode must be between 2 and 10 characters!   |

     # | Fred                                | Stone                               | Mountain View Sunnyvale             | San Jose                            |             | Your address has been successfully added        |
      #| Fred                                | Stone                               | Mountain View Sunnyvale             | San Jose                            | 1           | Your address has been successfully added        |
     # | Fred                                | Stone                               | Mountain View Sunnyvale             | San Jose                            | aaa         | Your address has been successfully added        |
    #  | Fred                                | Stone                               | Mountain View Sunnyvale             | San Jose                            | abcde12345, | Your address has been successfully added        |
