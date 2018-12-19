import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X;
        int Y=0;
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            if (X == 0) {
                System.out.println("Fib(" + X + ")" + "= " + Y);
            } else if (X < 60 && 0<X){
                Y = X - 1;
                System.out.println("Fib(" + X + ")" + "= " + Y);
            }
        }
    }
}
