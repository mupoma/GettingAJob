Feature: google search

  Scenario Outline: simple search
    Given I am on google homepage
    When I enter search  "<term>"
    And I click on google search button
    Then I recieve related search reasult

    Examples: 
      | term            | 
      | Chinese food    |
