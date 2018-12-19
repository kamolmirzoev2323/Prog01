import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        int pos;

        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
            pos = i;
            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X[" + pos + "]" + " " + "=" + " " + X[i]);
        }
    }
}