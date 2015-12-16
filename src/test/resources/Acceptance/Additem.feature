Feature: Adding item

  Scenario: Successfully adding item
    Given I am on add item page
    When I add correct type and amount
    Then Item should be added

