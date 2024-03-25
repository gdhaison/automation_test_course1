@FollowPage
Feature:   Follow Page
  @BDDPage
  Scenario:   Successful follow page
    Given I am on the panda page
    When I click BDD on the navigation bar
    And I enter a random email
    And I click follow button
    Then I should see a message success

