Feature: Search Feature

  Scenario: Verify if Google Search show results
    Given I open search engine url
    When I fill search input with search value
    Then I can see search results