package Java_Basic;

public class DataByteTypes {
    public static void main(String[] args) {
        //Các kiểu dữ liệu nguyên thủy hay dùng
        //character ký tự chỉ bao gồm 1 giá trị luôn nằm trong dấu nháy
        char score = 'A';

        int number = 2;
        // Kiểu dữ liệu đúng sai để so sánh actual và expect results
        boolean result = true;
        //Chuỗi ký tự luôn phải viết hoa chữ S
        String struden1 = "Havi";
        // Số thực, phải thêm f ở cuối để phân biệt với kiểu dữ liệu string
        float chuvi = 12.1234f;
        //float nằm trong khoảng, double thì rộng hơn (nhưng ít khi dùng double)

        //Kiểu dữ liệu tham chiếu mảng trong java yêu cầu các giá trị trong mảng có cùng kiểu dữ liệu
        // Ví dụ giá sản phẩm
        int[] gia_san_pham = {10, 20, 30, 40};
        //Câu lệnh in ra
//       System.out.print(gia_san_pham);
        //Không in được phải dùng vòng lặp for vì có 4 phần tử
        // Trong từng phần tử của giá sản phẩm mà trong đó có kiểu dữ liệu la integer và + với " " giữa các số để phân biệt)
        int tong_gia = 0;
        //Vòng lặp đầu tiên là 0 + 10, vòng lặp thứ 2 là 10+20 là 30
//        for (int gia : gia_san_pham) {
//            tong_gia = tong_gia + gia;
//
//            // tính tổng của giá trong mảng trên
//        }
//        System.out.print(tong_gia);

        //Toán tử so sánh: ==, <, > sẽ trả về kết quả true/false
        //Ví dụ so sánh actual + expect result
        //Sử dụng toán tử so sánh trong phần if else
//        System.out.print(1+2>2);
        int actual_result=10;
        int expected_result=20;

        if (actual_result==expected_result) {
            System.out.println("Test case pass");
        }
        else {
            System.out.println("Test case fail");
        }
    }
}
