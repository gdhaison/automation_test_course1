Feature: Product Search

  @search_product
  Scenario: Search a product
    Given Im on the home page
    When I go to product page
#    And I am on the product page
    And I search for product "product1"
    And I click search product