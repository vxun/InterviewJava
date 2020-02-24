import java.lang.*;

public class Example4 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        if (!(a == b) && (a == 1+b++)) {
            System.out.println("entrance if");
        }
        System.out.println("a = " + a + " b = " + b);
    }
}

