import java.util.Scanner;

public class dmC07 {
    public static void main(String[] args) {
//        for (int i = 4; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
        System.out.println("hình tam cân");
        for (int i = 0; i < 7; i++) {
            int j;
            //Thêm vòng lặp này để đặt khoảng cách ở trước mỗi hàng
            for (j = i; j < 7; j++) {
                System.out.print(" ");
            }
            for (j = 7 - i; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
