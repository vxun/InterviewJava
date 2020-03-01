

/**
 * 菲波那切数列, 0, 1, 1, 2, 3, 5
 */
public class Fibonacci {


    public static void main(String[] args) {
        System.out.println("fibonacci(0) = " + fibonacci(0));
        System.out.println("fibonacci(1) = " + fibonacci(1));
        System.out.println("fibonacci(2) = " + fibonacci(2));
        System.out.println("fibonacci(3) = " + fibonacci(3));
        System.out.println("fibonacci(4) = " + fibonacci(4));
        System.out.println("fibonacci(5) = " + fibonacci(5));
        System.out.println("fibonacci(6) = " + fibonacci(6));
    }

    public static long fibonacci(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

