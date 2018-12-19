import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,sum1,sum2;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        sum1 = c+d;
        sum2 = a+b;
        if (b>c && d>a && sum1>sum2 && c>0 && d>0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

    }
}
