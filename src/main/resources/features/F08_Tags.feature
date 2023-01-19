@regression
Feature: user should be able to login to the systems and  select different tags

  Background: user open the browser


  Scenario:Logged user could select different tags


    When Open Login page

    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button

    Then Login Successfully Back to loginPage

    And the user click on random category 'apparel'
    And select different tags




