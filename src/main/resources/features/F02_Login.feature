@smoke

Feature: user could login with his account
  Scenario: user could log in with valid email and password
    Given Open Login page
    When user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button
    Then Login Successfully Back to loginPage

