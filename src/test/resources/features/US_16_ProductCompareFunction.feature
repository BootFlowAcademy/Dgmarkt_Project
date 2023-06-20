Feature: Product Compare Function

  Background: : : The user logs in valid credentials and open homepage
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "nezih@bootflow.academy" and "12345" and clicks login
    Then Verify that the user is on home page

  @BFB1DGMAUT-16
  Scenario Outline: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare
    When The user hovers the "<Menu>" and click "<Submenu>"
    And The user clicks Product Compare button
    Then Verify that the user is on Comparison Page
    Examples:
      | Menu     | Submenu         |
      | Category | Health & Beauty |
      | Category | Televisions     |
      | Category | TV Accessories  |
      | Category | Networking      |

  @BFB1DGMAUT-16
  Scenario: The user should be able to see the Products they want to compare on the Product Comparison page
    When The user navigates to Health & Beauty category
    And The user adds products to the compare page
    And The user clicks Product Compare button
    Then Verify that the user can see "BaByliss 3663U - Hair rollers" and "Capsule Plate 6pcs" on the Comparison Page

  Scenario: The user receives a warning message when they want to add more than four Products to the Product Comparison page

