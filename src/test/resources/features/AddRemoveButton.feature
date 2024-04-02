Feature: Add and remove multiple Elements

  #   Scenario:   Successful Login with valid credentials
  @AddRemove
  Scenario Outline: Add and remove button
      Given I am on the add remove element page
      When I add <number_of_elements> elements
      Then <number_of_elements> delete button should be display
      When I delete <number_to_delete> elements
      Then <remaining_element> delete button should remain

    Examples: #(viết bảng dữ liệu truyền vào) (số lần ấn element, số lần ấn xóa, số nút delete còn lại sau khi xóa)
    | number_of_elements | number_to_delete | remaining_element |
    | 3                  | 2                | 1                 |
    | 3                  | 1                | 2                 |
    | 3                  | 3                | 0                 |
    | 3                  | 3                | 3                 |
    #(cụm Scenario Outline phải có examples)