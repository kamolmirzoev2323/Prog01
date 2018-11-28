import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Some real number? ");
        float a = scan.nextFloat();
        if (a>0 || a<0){
            System.out.printf("|%.3f| = %.3f",a,a);
        }
    }
}
