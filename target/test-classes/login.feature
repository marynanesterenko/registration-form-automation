Feature: User Registration
  As a user, I want to be able to register on the website

  Scenario: Successful login
    Given I navigate to the login page
    When I enter a valid username "username" with more than 5 characters
    And I enter a valid password "password1" with more than 8 characters
    And I submit the form
    Then I am registered and logged in

  Scenario: Invalid username
    Given I navigate to the login page
    When I enter an invalid username "user" with less than 5 characters
    And I enter a valid password "password1" with more than 8 characters
    And I submit the form
    Then I see the error message "Username or password incorrect"

  Scenario: Invalid password
    Given I navigate to the login page
    When I enter a valid username "username" with more than 5 characters
    When I enter an invalid password "pass" with less than 8 characters
    And I submit the form
    Then I see the error message "Username or password incorrect"

  Scenario: Check login status positive
    Given I navigate to the login page
    When I login using valid credentials
    Then I see login status "User is logged in"

  Scenario: Check login status negative
    Given I navigate to the login page
    When I enter an invalid username "user" with less than 5 characters
    And I enter a valid password "password1" with more than 8 characters
    And I submit the form
    Then I see login status "User is not logged in"

  Scenario: Logout
    Given I navigate to the login page
    When I login using valid credentials
    Then I see login status "User is logged in"
    When I click on the logout button
    Then I am logged out
