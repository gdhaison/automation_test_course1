package java_basic;

public class Circle {
    // Hang so viet in hoa
    public static final double PI = 3.1415;

    public static void main(String[] args) {
        int bankinh = 10;
        double chuvi;
        chuvi = 2 * PI * bankinh;
        System.out.print("Chu vi hinh tron can tinh la:");
        System.out.println(chuvi);

    }

    public static double tinhchuvi(int bankinh){;

    double chuvi = 2 * PI * bankinh;
        return chuvi;
    }
}