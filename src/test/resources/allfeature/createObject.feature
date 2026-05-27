Feature: Object API Tests

  @api_smoke
  Scenario Outline: Create a new object with valid details (Smoke)
    Given I have an object with the following details
      | name  | <name>  |
      | year  | <year>  |
      | price | <price> |
      | cpu   | <cpu>   |
      | disk  | <disk>  |
    When I send a POST request to create object
    Then the response status code should be 200
    And the response should contain the object details

    Examples:
      | name                   | year | price  | cpu             | disk |
      | Apple MacBook Pro 16   | 2019 | 1849.9 | Intel Core i9   | 1 TB |

  @api_regression
  Scenario Outline: Create a new object with valid details (Regression)
    Given I have an object with the following details
      | name  | <name>  |
      | year  | <year>  |
      | price | <price> |
      | cpu   | <cpu>   |
      | disk  | <disk>  |
    When I send a POST request to create object
    Then the response status code should be 200
    And the response should contain the object details

    Examples:
      | name                   | year | price  | cpu             | disk |
      | Apple MacBook Pro 16   | 2019 | 1849.9 | Intel Core i9   | 1 TB |
