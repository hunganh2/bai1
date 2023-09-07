import java.util.Scanner;

public class lt {

    public static void main(String[] args) {
        int count = 0;
        int snt = 2;
        while (snt < 100){
            count = 0;
            for (int i = 1; i <= snt ; i++) {
               if (snt % i == 0){
                   count++;
               }
            }
            if (count == 2){
                System.out.println(snt);
            }
            snt++;
        }

    }
}
