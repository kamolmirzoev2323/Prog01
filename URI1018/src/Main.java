import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int r1 = x/100;
        int r2 = x%100;
        int r3 = r2/50;
        int r4 = r2%50;
        int r5 = r4/20;
        int r6 = r4%20;
        int r7 = r6/10;
        int r8 = r6%10;
        int r9 = r8/5;
        int r10 = r8%5;
        int r11 = r10/2;
        int r12 = r10%2;
        int r13 = r12/1;
        int r14 = r12%1;
        System.out.println(r1+" nota(s) de R$ "+ "100,00");
        System.out.println(r3+" nota(s) de R$ "+ "50,00");
        System.out.println(r5+" nota(s) de R$ "+ "20,00");
        System.out.println(r7+" nota(s) de R$ "+ "10,0");
        System.out.println(r9+" nota(s) de R$ "+ "5,00");
        System.out.println(r11+" nota(s) de R$ "+ "2,00");
        System.out.println(r13+" nota(s) de R$ "+ "1,00");




    }
}
