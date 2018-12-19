import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        do {
            X = sc.nextInt();
            int a = 0;
            if (X % 2 == 0 && X != 0) {
                for (int k = X; k < (X + 10); k += 2) {
                    a += k;
                }
                System.out.println(a);
            } else if (X % 2 != 0) {
                for (int j = (X + 1); j <= (X + 10); j += 2) {
                    a += j;
                }
                System.out.println(a);
            }
        } while (X != 0);
    }
}