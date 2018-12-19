import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double volume = (4.0/3) * 3.14159 * r * r * r;
        System.out.printf("VOLUME = %.3f", volume);
    }
}
