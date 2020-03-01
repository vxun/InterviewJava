import java.math.*;

public class PrimeNumber{

    public static void main(String[] args) {
        sqrt();
    }

    public static void sqrt() {
        int a[] = new int[101];
        int i,j,k;
        for (i = 1; i < 101; i++) {
            k = (int)Math.sqrt(i);
            for ( j = 2; j <= k; j++) {
                if (i % j ==0) {
                    break;
                }
            }
            if (j > k) {
                System.out.println(" " + i);
            }
        }
    }

    public static void cycle() {
        int[] a = new int[101];
        int i,j;
        for (i = 1; i < 101;i ++) {
            a[i] = 1;
        }
        for (i = 2; i<101; i++) {

            if (a[i] != 0) {
                for (j = i + i; j < 101;) {
                    // i的倍数
                    if (j % i == 0) {
                        a[j] = 0;
                        j=j+i;
                    }
                }
            }
        }
        for (i = 2; i < 101; i++) {
            if (a[i] != 0) {
                System.out.println(i );
            }
        }
        
    }



}