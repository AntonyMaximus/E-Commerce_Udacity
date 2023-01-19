@smoke
Feature: user should be able to login to the systems and switch between currencies US-Euro

  Background: user open the browser

  Scenario:Logged User could switch between currencies US-Euro


    When Open Login page


    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button

    And Login Successfully Back to loginPage

    Then the user click on customer currency and select us or Euro




