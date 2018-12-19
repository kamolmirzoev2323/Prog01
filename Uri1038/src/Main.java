import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X ,Y;
        X = scanner.nextInt();
        Y = scanner.nextInt();
        switch (X){
            case 1:
                System.out.printf("Total: R$ %.2f\n",(Y*4.00));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n",(Y*4.50));
                break;
                case 3:
                System.out.printf("Total: R$ %.2f\n",(Y*5.00));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n",(Y*2.00));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n",(Y*1.50));
                break;
        }

    }
}
