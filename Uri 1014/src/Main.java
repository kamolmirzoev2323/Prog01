import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l,km, form;
        l = sc.nextDouble();
        km = sc.nextDouble();
        form = (km/l);
        System.out.printf("%.3f km/l\n",form);
    }
}
