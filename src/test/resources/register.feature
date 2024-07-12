Feature: Register a new account
  @RegisterPage
  Scenario: User registers a new account
    Given the user is on the homepage
    When the user clicks on the "My Account" drop menu
    And the user clicks on the "Register" option
    And the user enters the following details into the mandatory fields:
      | First Name       | John       |
      | Last Name        | Doe        |
      | E-Mail           | john.doe@example.com |
      | Telephone        | 1234567890 |
      | Password         | password123 |
      | Password Confirm | password123 |
    And the user clicks on the "Continue" button
    Then the user should see the "Account Success" page
    When the user clicks on the "Continue" button on the "Account Success" page
    Then the user should be redirected to the homepage (or relevant page post registration)