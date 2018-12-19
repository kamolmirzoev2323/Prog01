import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,r1,r2,S;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        S = b*b - 4*a*c;
        if (S>0 && a>0){
            r1 = (float)(-b+Math.sqrt(S))/(2*a);
            r2 = (float)(-b-Math.sqrt(S))/(2*a);
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }
        else {
            System.out.println("Impossivel calcular");
        }
    }
}
