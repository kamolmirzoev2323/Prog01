import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double r = scanner.nextDouble();
        int l = scanner.nextInt();
        double area = r * r * 3.1415;
        double volume = area * l;
        System.out.printf("The area is %.4f%n",area);
        System.out.printf("The volume is %.1f%n", volume);


    }
}
