@smoke
Feature: user should be able to login to the systems and add different products to Wishlist


  Background: user open the browser

  Scenario:Logged user could add different products to Wishlist

    When Open Login page

    And user enter "tonymaximus@gmail.com" and "Orange"
    And Click on Login button

    And Login Successfully Back to loginPage

    Then user select 'cell phones' from 'electronics' category
    And user add products to wishlist
    And user go to the wishlist page
