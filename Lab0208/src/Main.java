import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = scanner.nextDouble();
        double kg = pound * 0.454;
        System.out.printf(pound+" pounds is %.3f kilograms", kg);
    }
}
