Feature: Product Compare Function

  Background: The user logs in valid credentials and open homepage
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "nezih@bootflow.academy" and "12345" and clicks login
    Then Verify that the user is on home page


  @BFB1DGMAUT-16
  Scenario: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare Health&Beauty sub-Tab
    When The user hover over Category button and click Health&Beauty button
    Then The user should be able to see Health&Beauty page

  @BFB1DGMAUT-16
  Scenario: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare Televisions sub-Tab
    When The user hover over Category button and click Televisions button
    Then The user should be able to see Televisions page

  @BFB1DGMAUT-16
  Scenario: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare TV Accessories sub-Tab
    When The user hover over Category button and click TV Accessories button
    Then The user should be able to see TV Accessories page

  @BFB1DGMAUT-16
  Scenario: The user should be able to navigate the Product Compare Page when the User clicks on the Product Compare Networking sub-Tab
    When The user hover over Category button and click Networking button
    Then The user should be able to see Networking page
