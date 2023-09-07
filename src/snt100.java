import java.util.Scanner;

public class snt100 {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng số nguyên tố:");
//        int number1 = number.nextInt();
        int count1 = 0;
        int count = 0;
        int N = 2;
        while (N < 100) {
           count = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
//                count1++;
                System.out.println(N);
            }
            N++;
        }
    }
}
