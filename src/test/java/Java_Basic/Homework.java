package Java_Basic;
import  java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        double[] numbers = {8.231, 8.892, 2.991, 8.561, 1.22};
        //Gán số lớn nhất = 0
        double max = 0;
        //Chạy hết trong 1 arraylist
        for (double number : numbers)    //number lấy từng số trog mảng numbers
        {
            //Nếu số lớn nhất nhỏ hơn số trong mảng thì gán max = số tiếp theo
            if (max < number) {
                max = number;
            }

        }
        System.out.print("So lon nhat la:" + max);
        {
            int[] so = {1, 4, 72, 12999};
            int tong = 0;
            for (int so1 : so) {
                tong = tong + so1;
            }
            System.out.print("Tong so la:" + tong);
        }
              //Tính giai thừa
        {
            Scanner scanner= new Scanner(System.in);    //Câu lệnh in để nhập
            System.out.print("Nhập số nguyên: ");
            int number = scanner.nextInt();    //Trả về số vừa nhập là số nguyên
            int giaithua = 1;
            for (int i=1; i <= number ; i++) {
                giaithua = giaithua*i;
            }
          System.out.print("Giai thua la:" + giaithua);
        }
            //Kiểm tra số chẵn lẻ
            {
                Scanner scanner = new Scanner(System.in);    //Câu lệnh in để nhập
                System.out.print("Nhập số nguyên cần kiểm tra: ");
                int number = scanner.nextInt();
                //Phép tính toán tử % là phép chia lấy dư nên dư = 0 nếu là số chẵn
                if  (number % 2 == 0) {
                    System.out.println("So nay la so chan");
                } else
                {
                    System.out.println("So nay la so le");
                }
            }

    }
}


