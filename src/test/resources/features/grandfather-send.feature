Feature: Grandfather Send

  Scenario: Grandfather arrives on dc-product and already have father and son
    Given son and father are valid on dc-product
    When grandfather arrives on dc-product
    And grandfather is valid
    Then grandfather must be persisted on dc-product database