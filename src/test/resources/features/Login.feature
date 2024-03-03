@exampleFeature
Feature: Login

  @loadpage
  Scenario: Login Kiotviet
    Given the site "DuckDuckGo" is open
    Then the searchbar is enable