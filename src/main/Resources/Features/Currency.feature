@Currency
  Feature: User should be able to change the currency succesfully,
    So that he can see all the products with changed currency

  Scenario: User should be able to change the currency to Dollar
    Given user is on home page
    When user click on Books
    And user click on change currency
    Then user can see products in Dollar value