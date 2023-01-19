@smoke
Feature: user should be able to login to the systems and filter with color

  Background: user open the browser


  Scenario:Logged user could filter with color


    When Open Login page

    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button


    And Login Successfully Back to loginPage

    And the user select Apparel  category
    Then select shoes sub category
    And user select colors

