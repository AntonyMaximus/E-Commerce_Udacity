@regression
Feature: user should be able to login to the systems and add different products to compare list

  Background: user open the browser


  Scenario:Logged user could add different products to compare list

    When Open Login page

    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button

    And Login Successfully Back to loginPage

    Then user select 'cell phones' from 'electronics' category
    And user add products to compare list
    And user go to the compare page



