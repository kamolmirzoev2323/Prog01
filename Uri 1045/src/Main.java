import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        if ((A > 0) && (B > 0) && (C > 0)) {
            if (A >= B + C || B >= A + C || C >= A + B) {
                System.out.println("NAO FORMA TRIANGULO");
                if (A == B || A == C || B == C) {
                    System.out.println("TRIANGULO ISOSCELES");
                } else if (A == B && B == C ) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
            } else if ((A * A) == (B * B) + (C * C) || ((B * B) == (A * A) + (C * C)) || (C * C) == (B * B) + (A * A)) {
                System.out.println("TRIANGULO RETANGULO");
                if (A == B || A == C || B == C) {
                    System.out.println("TRIANGULO ISOSCELES");
                } else if (A == B && B == C) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
            } else if ((A*A) > (B * B) + (C * C) || ((B * B) > (A * A) + (C * C)) || (C * C) > (B * B) + (A * A)) {
                System.out.println("TRIANGULO OBTUSANGULO");
                if (A == B || A == C || B == C) {
                    System.out.println("TRIANGULO ISOSCELES");
                } else if (A == B && B == C) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
            } else if ((A * A) < (B * B) + (C * C) || ((B * B) < (A * A) + (C * C)) || (C * C) < (B * B) + (A * A)) {
                System.out.println("TRIANGULO ACUTANGULO");
                if (A == B && B == C ) {
                    System.out.println("TRIANGULO EQUILATERO");
                }else  if (A == B || A == C || B == C) {
                    System.out.println("TRIANGULO ISOSCELES");
                }

            } else if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
