@AutomationPandaFeature
Feature: login AutomationPanda

  @PositiveTest
  Scenario: Successful follow page automationpanda
    Given i am on the page automationpanda
    When i click BDD at navigation bar
    And I enter email "<input_email>"
    And i click on follow button
    Then i should see a notification email confirm
git