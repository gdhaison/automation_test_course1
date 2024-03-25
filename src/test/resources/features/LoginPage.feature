@LoginFeature
  #đặt tag để chạy riêng testcase đó bằng dấu @ đằng trước. Để ở đầu là chạy toàn bộ testcase trong file này
Feature:   Login Feature
  #đặt tên cho tên file
  @PositiveTest
    #Chỉ chạy 1 tag ví dụ như chạy các tag happycase
  Scenario:   Successful Login with valid credentials
    #đặt tên cho testcase
  Given I am on the login page
    #Given tức là bối cảnh đã phải đang ở đó, gọi là pre-condition. Ở đây là điều kiện đã ở trang login
  When I enter the username "tomsmith"
#    #Đặt text trong "" để sử dụng được các case khác, VD thay 1 username khác để check tiếp
  And I enter password "SuperSecretPassword!"
  And I click on login button
  Then I should see a logout button
    #Muốn Verify thì dùng từ khóa Then
  #1 testcase đầy đủ thì bắt đầu bằng given và kết thúc bằng then
