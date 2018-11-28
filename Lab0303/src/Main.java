import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("1st number? ");
        a = scanner.nextInt();
        System.out.print("2nd number? ");
        b = scanner.nextInt();
        System.out.print("3rd number? ");
        c = scanner.nextInt();
        if (a>b && a>c){
            System.out.print("The value " +a+" is greater one.");
        }
        if (b>a && b>c){
            System.out.print("The value " +b+" is greater one.");
        }
        if (c>b && c>a){
            System.out.print("The value " +c+" is greater one.");
        }

    }
}
