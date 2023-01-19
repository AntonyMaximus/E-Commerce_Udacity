@smoke

Feature: users could register with new accounts
  Scenario: user could register with valid data successfully
    Given user navigate to registration page
    When user select gender
    And user enters first name
    And user enters last name
    And user select date of birth
    And user enters email address
    And user enters company name
    And user select newsletter options
    And user enters password
    And user enters confirm password
    And user clicks on register button
    Then user could register successfully
