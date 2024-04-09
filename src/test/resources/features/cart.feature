#Bài tập
#Dùng Scenario Outline để thiết kế 3 test case test giỏ hàng:
#|Tên Hàng              |GIá            |
#|Blue Top                | RS. 500.  |
#|Men Tshirt             | RS. 400   |
#|Sleeveless Dress  | RS. 1000  |
#
#Step1: ĐI tới trang web “https://automationexercise.com/products”
#Step2: Nhập tên hàng vào ô tìm kiếm, Nhấn tìm kiếm
#Step3: Verify search hàng hoá thành công
#Step4: Bấm thêm vào giỏ hàng
#Step5: Nhấn “view cart” để đi tới giỏ hàng
#Step6: Verify hàng hoá có trong giỏ hàng có tên và giá đúng với hàng hoá đã thêm ở Step 3

Feature: Verify name and price product in the cart
    @VerifyProduct
    Scenario Outline: Verify name and price product
      Given I am go to page product
      When I am input "<Name>" in search and click on search
      Then I am verify search product successful
      When I click on add in the cart
      And  I click on view cart go to the cart
      Then I verify product in the cart have "<Name>" and "<Price>" correct to product in step 3



      Examples:
          | Name             | Price     |
          |Blue Top          | Rs. 500   |
          |Men Tshirt        | Rs. 400   |
          |Sleeveless Dress  | Rs. 1000  |


