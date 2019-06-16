Feature: As a user i want to be able to search for some keywords on google

  Scenario Outline: Search for a book
    Given I am on the google home page
    When I search for the book "<book_name>"
    Then Search results should be displayed
    Examples:
      | book_name           |
      | secret              |
      | the secret          |
      | secret rhonda byrne |