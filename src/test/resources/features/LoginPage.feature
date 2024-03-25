#Tag Login Feature: Thực thi toàn bộ testcase trong file
@LoginFeature
Feature: Login Feature
  #Tag : Của từng case nhỏ
  @PositiveTest
  Scenario: Successful login with valid credentials
    #Given = pre : Bối cảnh, mình đang ở đâu?
    Given I am on the login page
#    # When = Step
    When I enter the username "tomsmith"
    And I enter password "SuperSecretPassword!"
#    #Sử dụng dấu nháy "" để tái sử dụng lại hàm
    And I click on login button
    Then  I should see a logout button
#    #Then : Kết quả mong muốn