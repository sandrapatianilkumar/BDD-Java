@tag
Feature: Evaluate Percentage

  Scenario: verify 10% discount
    Given Execute DiscountService business
    When If i will enter 5001
    Then It should get ten percentage discount

  Scenario: verify 15% discount
    Given Execute Discountservice business
    When If I will enter 10001
    Then It should get fifteen percentage discount

  Scenario: verify no offer
    Given Execute Discountservice business
    When If I will enter 4000
    Then It should get any percentage discount
