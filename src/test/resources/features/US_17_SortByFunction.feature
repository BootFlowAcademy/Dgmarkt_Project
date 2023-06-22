@BFB1DGMAUT-17
Feature: Sort By Function

  Background: The user is on home page
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    When The user clicks the login under the my account
    And The user enters account credentials "hsena@gmail.com" and "fdsfdsfds" and clicks login

  Scenario Outline: The user sees default sort on subcategory "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    Then Verify that the sortby is displayed and selected default
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  Scenario Outline: The user sorts products by Name (A-Z) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Name (A - Z)"
    Then Verify that the products are sorted by Name (A-Z)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  Scenario Outline: The user sorts products by Name (Z-A) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Name (Z - A)"
    Then Verify that the products are sorted by Name (Z-A)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  Scenario Outline: The user sorts products by Price (Low-High) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Price (Low > High)"
    Then Verify that the products are sorted by Price (Low-High)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |


  Scenario Outline: The user sorts products by Price (High-Low) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Price (High > Low)"
    Then Verify that the products are sorted by Price (High-Low)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  Scenario Outline: The user sorts products by Model (A-Z) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Model (A - Z)"
    Then Verify that the products are sorted by Model (A-Z)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |

  Scenario Outline: The user sorts products by Model (Z-A) on sub category "<subcategory>"
    When The user navigates to sub-category "<subcategory>"
    And The user selects sort type by "Model (Z - A)"
    Then Verify that the products are sorted by Model (Z-A)
    Examples:
      | subcategory     |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |