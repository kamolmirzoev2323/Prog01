import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i;
        float[] N = new float[100];
        double X = sc.nextDouble();
        for (i = 0; i < N.length; i++) {
            System.out.printf("N[%.0f] = %.4f\n",i,X);
            X = X/2;
           }
    }
}