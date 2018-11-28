import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year? ");
        int leap[9] = {1796, 1804, 1896, 1904, 1992, 1996, 2000, 2004, 2008};
        int []a = {scanner.nextInt()};
        if (a==leap) {
            System.out.print("This is a leap year");
        }
    }
}