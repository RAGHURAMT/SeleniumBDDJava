
Feature: Bright Horizons Search feature
  As a user
  I should be able to search using the search feature

  Scenario: Verify user is able to search by passing the value into the search
    Given I am on the homepage to test search functionality
    When I click on the search button
    And I pass the value "Employee Education in 2018: Strategies to Watch" into a search field
    And I click on Search button
    Then search result "Employee Education in 2018: Strategies to Watch" displayed as the first search item in the search page