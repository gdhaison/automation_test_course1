#Bài tập buổi 3:
#Tạo một test case test chức năng follow page của trang: "https://automationpanda.com/"
#Step1: đi tới trang https://automationpanda.com/
#Steps2: CLick vào mục "BDD" ở navigation bar
#step3: nhập email bất kỳ có dạng {random_string}@gmail.com (tự tìm hiểu cách random 1 string trong java) vào mục follow -> Bấm nút follow
#step4: Verify đã hiện thông báo gửi mail xác nhận

@FollowPageFeature
Feature: FollowPage Feature
  @PositiveTest2
  Scenario: Verify email confirm with random valid credentials
    Given I am go to page
    When I click on item BDD in navigation bar
    And I enter random email on follow item
    Then I see noti email confirm


