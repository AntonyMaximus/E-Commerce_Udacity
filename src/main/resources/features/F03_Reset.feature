Feature: user should be able to reset the password

  Background: user open the browser

  Scenario: User could reset his/her password successfully


    And user navigate to reset page

    When the user enter "tonymaximus@gmail.com"
    And user click on recover button

    Then user could reset password successfully