Feature: Logged in user should be able to find fo an artist and add him to or delete him from favorite list

  Background: Login into account with correct credentials
    Given User launches Mixcloud website
    When User clicks on the loginbutton
    And User enters valid username
    And User enters valid password
    When User clicks on the Log in button
    Then User should successfully be logged in

  Scenario: Find Martin Garrix and add him to and delete him from the favorite list
    Given the User click on search field
    When the User enters artist name in the search field
    And the User clicks on artist image
    And the User clicks on favorite button
    And the User clicks on Your Profile button
    When the User clicks on check sign
    Then the artist is deleted from favorite
