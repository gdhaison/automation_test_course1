Feature: Add and remove multiple Elements
  @AddRemove
  Scenario Outline: Add and remove button
    Given I am on the add remove element page
    When I add <number_of_elements> elements
    Then <number_of_elements> delete button should be display
#  (note : Dùng findElements -> Mảng so sánh với số đã nhập vào)
    When I delete <number_to_delete> elements
    Then <remaining_element> delete button should remain


    Examples:
    | number_of_elements | number_to_delete | remaining_element |
    | 3                  | 1                | 2                 |
    | 4                  | 1                | 2                 |



