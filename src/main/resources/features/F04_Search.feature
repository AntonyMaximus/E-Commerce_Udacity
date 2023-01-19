@smoke
Feature: user should be able to login to the systems and earch for any product

  Background: user open the browser


  Scenario: Logged User could search for any product

    When Open Login page


    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button
    And Login Successfully Back to loginPage

    Then the user enter "notebook" for any product
    And user click on search button

    And user could search for any product successfully