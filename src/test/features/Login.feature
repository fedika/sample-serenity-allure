Feature: Login

  Scenario: Customer can login
    Given I open the website
    When I click burger menu
    When I click My Account menu
    When I click Login menu
    Then I can see Login page
    When I input email "user@phptravels.com"
    And I input password "demouser"
    And I click Submit button
    Then I can see Account page contains "Johny Smith"