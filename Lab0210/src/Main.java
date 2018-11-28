import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the years: ");
        int years = scanner.nextInt();
        int popul = years * 65186594;
        System.out.print("The population in " +years +" is " +popul);
    }
}
