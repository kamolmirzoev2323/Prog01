import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,x,y,z;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        z = (24-a)+c;
        x = c-a;
        y = (-b)+d;
        if (a>=c && y>=0){
            System.out.printf("O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n",z,y);
        }else if (a<=c && y>=0){
            System.out.printf("O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n",x,y);
        }else if (a<=c && y<0){
            double fin = ((60*x)+y)%60;
            double fin2 = ((60*x)+y)/120;
            System.out.printf("O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n",fin2,fin);
        }
    }
}
