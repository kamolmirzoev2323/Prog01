import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, i,j;
        int N[] =new int[1000];
        Scanner input =new Scanner(System.in);
        T =input.nextInt();


        for ( i = 0,j = 0; i < N.length; j++,i++) {
            N[j] = j;
            if ((N[j]) == T) {
                j = 0;
            }
            System.out.print("N["+i+"] = "+N[j]+"\n");
        }
    }
}