Feature: Stay Search

  Scenario: Verify user can search stay
    Given user opens application
    Then verify user is on home screen
    When user clicks on Stays menu
    Then verify user is on Enter destination screen

    When user enters "destination.stay"
    Then verify user is on Stays screen

    When user clicks on select dates field
    And user selects date "checkin.date"
    And user selects date "checkout.date"
    And user clicks on Dates Done button
    Then verify user is on Stays screen

    When user clicks on Search button
    Then verify in location field "destination.stay" is present
    And verify there is more than one stay card on screen