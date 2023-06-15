Feature: Change Password Test - The user can change the password

  Background:
    Given The user navigate to web site
    When The user enters login panel credential and clicks login
    And The user closes cookies pop up
    Then Verify that the user sees home logo icon
    When The user clicks the login under the my account
    And The user enters account credentials "salihotest@gmail.com" and "Test1234" and clicks login
    Then Verify that the user is on home page
    Then The user go to my account page
    Then The user go to password page

  @BFB1DGMAUT-9_1
  Scenario: The user can change the password with valid credentials which is between 4-20 characters.
    Given The user enters valid credentials
    Then Verify that password change confirmed.

  @BFB1DGMAUT-9_2
  Scenario: The user enters password with valid credentials which is between 4 and 20 characters. Also enters different password than desired password.
    Given The user enters valid credentials with different datas
    Then Verify that password change could not confirm.

  @BFB1DGMAUT-9_3
  Scenario Outline: The user should not change the password with invalid credentials which is between 1-3 characters.
    When The user enters "<password>" and "<passwordConfirm>" credentials
    Then Verify that warning message is displayed
    Examples:
      | password | passwordConfirm |
      | Q        | Q               |
      | 1$       | 1$              |
      | a4(      | a4(             |








