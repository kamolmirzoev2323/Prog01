import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (c<a && c<b && b>a ){
            System.out.printf("%d\n%d\n%d\n",c,a,b);
        }else if (a<b && a<c && b>c){
            System.out.printf("%d\n%d\n%d\n",a,c,b);
        }else if (b<c && b<a && a>c ){
            System.out.printf("%d\n%d\n%d\n",b,c,a);
        }else if (a<b && a<c && b<c){
            System.out.printf("%d\n%d\n%d\n",a,b,c);
        }else if (b<a && b<c && c>a ){
            System.out.printf("%d\n%d\n%d\n",b,a,c);
        }else if (c<a && c<b && a>b ){
            System.out.printf("%d\n%d\n%d\n",c,b,a);
        }
        System.out.println();
        System.out.printf("%d\n%d\n%d\n",a,b,c);
    }
}
