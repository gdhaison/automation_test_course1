package java_basic;

public class TimSoLonNhat {


    public static void main(String[] args) {
        int[] numbers = {1, 5, 12, 56, 78, 66};
        System.out.println("So lon nhat la:" + Solonnhat(numbers));

    }
    public static int Solonnhat(int[] numbers){
        int i = numbers[0];
        for (int a : numbers) {
            if (i < a){
                i = a;
            }
        }
        return i;
    }
}