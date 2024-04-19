Feature: Product Search

  @search_product
  Scenario: Search a product
    Given Im on the home page
    When I go to product page
#    And I am on the product page
    And I search for product "Blue Top"
    And I click search product
    And I click view product detail
    And I add my product to cart
    And I go to cart
    Then I see "Blue Top" display in the cart