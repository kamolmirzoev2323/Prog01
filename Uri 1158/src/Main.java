import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), X, Y;
        for (int i = 1; i <= N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            int a = 0;
            if (X % 2 != 0) {
                for (int k = X; k < X + (Y * 2); k += 2) {
                    a += k;
                }
                System.out.println(a);
            } else if (X % 2 == 0) {
                for (int j = X + 1; j <= X + (Y * 2); j += 2) {
                    a += j;
                }
                System.out.println(a);
            }
        }
    }
}
