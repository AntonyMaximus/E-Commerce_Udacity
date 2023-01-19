@smoke
Feature: user should be able to login to the systems and add different products to compare list

  Background: user open the browser


  Scenario:Logged user could add different products to compare list
    When Open Login page
    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button
    And Login Successfully Back to loginPage
    Then user select 'cell phones' from 'electronics' category
    And user add products to cart
    And user go to the cart page
    And user checkout the terms and click on checkout button
    And user enter the data of address and click continue
    And user check shipping method and click continue
    And user check payment method and click continue
    And user check payment information and click continue
    And user confirm order and click confirm





