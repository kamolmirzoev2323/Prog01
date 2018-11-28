import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = scanner.nextInt();
        int day = 24 * 60;
        int year = day * 365;
        int ally = min / year;
        System.out.printf(min + " minutes is proximately %.f% years", ally);

    }
}
