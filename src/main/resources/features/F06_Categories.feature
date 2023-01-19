@smoke
Feature: user should be able to login to the systems and select different Categories

  Background: user open the browser

  Scenario:Logged user could select different Categories


    When Open Login page

    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button

    And Login Successfully Back to loginPage

    Then the user click on random category 'electronics'
    And select sub category if found




