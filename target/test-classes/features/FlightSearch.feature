Feature: Flight Search

  Scenario: Verify user can search flight
    Given user opens application
    Then verify user is on home screen
    When user clicks on Flights menu
    Then verify user is on Flights search screen

    When user clicks on Flying from field
    Then verify user is on Flying from screen
    When user enters Flying from "departure.city"

    Then verify user is on Flying to screen
    When user enters Flying to "arrival.city"
    Then verify user is on dates screen

    When user selects date "start.date"
    And user selects date "end.date"
    And user clicks on Dates Done button
    Then verify user is on Flights search screen

    When user clicks on Travelers
    Then verify user is on travelers screen
    When user increases adults by one
    And user clicks on Travelers Done button
    Then verify user is on Flights search screen

    When user clicks on Preferred class
    And user chooses business class
    And user clicks on Class Done button
    Then verify user is on Flights search screen

    When user clicks on Search button
    Then verify in location field "departure.city" and "arrival.city" are present
    And verify there is more than one card on screen

  Scenario: Verify user cannot search flight with same departure and arrival city
    Given user opens application
    Then verify user is on home screen
    When user clicks on Flights menu
    Then verify user is on Flights search screen

    When user clicks on Flying from field
    Then verify user is on Flying from screen
    When user enters Flying from "departure.city"

    Then verify user is on Flying to screen
    When user enters Flying to "departure.city"
    Then verify user is on dates screen

    When user selects date "start.date"
    And user selects date "end.date"
    And user clicks on Dates Done button
    Then verify user is on Flights search screen

    When user clicks on Search button
    Then verify user gets an error message with text
      | Please make sure your departure and arrival cities are in different places. |
    And user clicks on done button on alert