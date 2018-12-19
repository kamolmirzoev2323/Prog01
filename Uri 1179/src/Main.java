import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int j = 0;
        int l = 0;
        int[] par = new int[n];
        int[] impar = new int[n];
        Scanner s = new Scanner(System.in);

        int i;
        for(i = 0; i < 15; ++i) {
            int a = s.nextInt();
            int m;
            if (a % 2 == 0) {
                par[j] = a;
                ++j;
                if (j == 5) {
                    for(m = 0; m < 5; ++m) {
                     System.out.println("par[" + m + "] = " + par[m]);
                     par[m] = 0;
                    }
                 j = 0;
                }
            } else {
                impar[l] = a;
                ++l;
                if (l == 5) {
                    for(m = 0; m < 5; ++m) {
                     System.out.println("impar[" + m + "] = " + impar[m]);
                    impar[m] = 0;
                   }
             l = 0;
            }
          }
        }
        for(i = 0; i < 5 && impar[i] != 0; ++i) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for(i = 0; i < 5 && par[i] != 0; ++i) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}
