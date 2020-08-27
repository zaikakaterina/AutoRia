Feature: A user should be able to select a car and open its page

  Scenario: Open auto.ria website and select a car
    Given User launch auto ria website
    And User selects used cars
    And User selects cars by filters
    When User clicks Search button
    Then User should be able to open a page of one car