import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        int num1 =(int)(a/100);
        int num2 = (int)((a%100)/50);
        int num3 = (int)(((a%100)%50)/20);
        int num4 = (int)((((a%100)%50)%20)/10);
        int num5 = (int)((((a%100)%50)%20)%10/5);
        int num6 = (int)((((a%100)%50)%20)%10%5/2);
        int num7 = (int)((((((a%100)%50)%20)%10)%5)%2);
        int num8 = (int)(((((((a%100)%50)%20)%10)%5)%2)%1/0.50);
        int num9 = (int)(((((((((a%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25);
        int num10 = (int)((((((((((a%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10);
        int num11 = (int)(((((((((((a%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05);
        int num12 = (int)Math.round((((((((((((a%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)%0.05)/0.01);
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00 \n",num1);
        System.out.printf("%d nota(s) de R$ 50.00 \n",num2);
        System.out.printf("%d nota(s) de R$ 20.00 \n",num3);
        System.out.printf("%d nota(s) de R$ 10.00 \n",num4);
        System.out.printf("%d nota(s) de R$ 5.00 \n",num5);
        System.out.printf("%d nota(s) de R$ 2.00 \n",num6);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00 \n",num7);
        System.out.printf("%d moeda(s) de R$ 0.50 \n",num8);
        System.out.printf("%d moeda(s) de R$ 0.25 \n",num9);
        System.out.printf("%d moeda(s) de R$ 0.10 \n",num10);
        System.out.printf("%d moeda(s) de R$ 0.05 \n",num11);
        System.out.printf("%d moeda(s) de R$ 0.01 \n",num12);

    }
}
