@smoke

Feature: Login | users could login with their accounts
  Scenario: user could log in with valid email and password
    Given Open Login page
    When Enter email & password
    And Click on Login button
    Then Login Successfully Back to loginPage
  Scenario: user could log in with invalid email and password
    Given Open Login page
    When Invalid E-Mail & Passwprd
    And Click on Login button
    Then user login failed and error message appears
