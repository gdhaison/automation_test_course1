package Java_Basic;

public class Circle {
    // Hằng số (constant) là giá trị không thay đổi được - thường được khai báo với từ khóa 'final' và tên biến VIẾT HOA TẤT CẢ
    public static final double PI = 3.14159;
    public static void main(String[] args) {
//        // Khai báo một biến số (là số thay đổi được) nguyên (integer)
//        int radius = 10;   //Bán kinh của một hình tròn
//
//        //Khai báo một biến số thực (floating-point = double: số thực)
//        double circumference;
//        // Tính chu vi của hình tròn
//        circumference = 2 * PI * radius;
//
//        //In giá trị của biến ra màn hình
//        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
//
//        //Thử thay đổi giá trị của hằng số PI (điều này sẽ gây ra lỗi vì PI là final)
//        // PI = 3,14; // Bỏ comment dòng này sẽ gây ra lỗi biên dịch vì không thể gán giá trị mới cho hàng số
//
//        //Thay đổi giá trị của biến radius và tính chu vi mới
//        radius = 20;
//        circumference = 2 * PI * radius;
//        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
            System.out.print(tinhchuvi(10));
    }
    public static double tinhchuvi(int bankinh) {
        //ở đây không được đặt tên công thức giống với hàm "tinhchuvi" mà mình đang lấy ra
        //Hàm đang yêu cầu trả về dạng double thì ở dưới cũng phải khai báo là dạng double nếu khai báo int chu vi thì sai
        double chuvi = 2*PI*bankinh;
        return chuvi;
    }

}
