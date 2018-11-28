import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of points? ");
        int a = scanner.nextInt();
        if (a<40){
            System.out.println("You failed <<Structural Programming>>!!!");
            System.out.println("You can take it again in the fall semester of 2019");
        }
        if (a>40){
            System.out.println("You passed <<Structural Programming>>!!!");
            System.out.println("You should take <<Object-oriented Programming>> in the next semester");
        }
    }
}
