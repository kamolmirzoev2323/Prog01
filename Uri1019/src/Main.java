import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hours = num/3600;
        int min = (num%3600)/60;
        int sec = ((num%3600)%60);
        System.out.println(hours+":"+min+":"+sec);
    }
}
