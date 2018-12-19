import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double newsal= (salary/100);
        if (salary >= 0 && salary <=400){
            System.out.printf("Novo salario: %.2f\n",(salary+(newsal*15)));
            System.out.printf("Reajuste ganho: %.2f\n",(newsal*15));
            System.out.println("Em percentual: 15 %");
        }else if (salary >= 400 && salary<=800.00){
            System.out.printf("Novo salario: %.2f\n",(salary+(newsal*12)));
            System.out.printf("Reajuste ganho: %.2f\n",(newsal*12));
            System.out.println("Em percentual: 12 %");
        }else if (salary >= 800.01 && salary<= 1200.00){
            System.out.printf("Novo salario: %.2f\n",(salary+(newsal*10)));
            System.out.printf("Reajuste ganho: %.2f\n",(newsal*10));
            System.out.println("Em percentual: 10 %");
        }else if (salary >=1200.01 && salary<=2000.00){
            System.out.printf("Novo salario: %.2f\n",(salary+(newsal*7)));
            System.out.printf("Reajuste ganho: %.2f\n",(newsal*7));
            System.out.println("Em percentual: 7 %");
        }else if (salary>2000.00){
            System.out.printf("Novo salario: %.2f\n",(salary+(newsal*4)));
            System.out.printf("Reajuste ganho: %.2f\n",(newsal*4));
            System.out.println("Em percentual: 4 %");
        }
    }
}
