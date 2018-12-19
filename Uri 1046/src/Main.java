import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,hour,hour1,max;
        max = 24;
        a = sc.nextInt();
        b = sc.nextInt();
        hour = (max-a)+b;
        hour1 = (b-a);
        if (a>b){
            System.out.printf("O JOGO DUROU %d HORA(S)\n",hour);
        }else if (a<b){
            System.out.printf("O JOGO DUROU %d HORA(S)\n",hour1);
        }else if (a==b){
            System.out.printf("O JOGO DUROU %d HORA(S)\n",max);
        }
    }
}
