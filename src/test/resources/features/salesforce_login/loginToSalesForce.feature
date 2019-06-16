Feature: Test Login to Salesforce

  Scenario: Invalid UserName and Password Combination
    Given I am on the sales force login page
    When I enter my "username" and "password"
    Then I should see an error message