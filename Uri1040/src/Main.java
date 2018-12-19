import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a,b,c,d,e;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        d = scan.nextFloat();
        float med = ((((a * 2) + (b * 3) + (c * 4) + (d * 1))) / (2 + 3 + 4 + 1));
        if (med >= 7.0){
            System.out.printf("Media: %.1f\n", med);
            System.out.println("Aluno aprovado.");
        }else if ( med < 5.0){
            System.out.printf("Media: %.1f\n", med);
            System.out.println("Aluno reprovado.");
        }else if(med >= 5.0 && med <= 6.9){
            System.out.printf("Media: %.1f\n", med);
            System.out.println("Aluno em exame.");
            e = scan.nextFloat();
            float med1 = (med + e)/2;
            System.out.printf("Nota do exame: %.1f\n", e);
            if (med1 >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if(med1 <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", med1);

        }
    }
}

