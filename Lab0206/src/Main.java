import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree Celsius: ");
        int celcius = scanner.nextInt();
        double Fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.printf(celcius+" Celsius is %.1f Fahrenheit", Fahrenheit);

    }
}
