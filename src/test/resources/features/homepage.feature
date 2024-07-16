
Feature: Bright Horizons Homepage
  As a user
  I want to be able to see all the comments

  Scenario: Verify comments are displayed in the edassist-solutions page
    Given I am on the homepage
    When I click on the Learn More button of section EdAssist Solutions for Employers
    Then I naviagted to the edassist-solutions page
    And I verify comments section is available on the page