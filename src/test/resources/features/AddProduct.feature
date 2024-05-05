Feature: Add products to cart


  @AddProducts
  Scenario Outline: Add products to cart
    Given I am on the add product page
    When I add "<product_name>" elements and click search
    Then I search successful
    When I add product to cart
    And I go to the cart
    Then "<product_name>" and "<price>" should in the cart

    Examples:
      | product_name     | price    |
      | Blue Top         | Rs. 500  |
#      | Men Tshirt       | Rs. 400  |
#      | Sleeveless Dress | Rs. 1000 |
    #(cụm Scenario Outline phải có examples)