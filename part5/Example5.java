public class Example5 {
    public static void main(String[] args) {
        int i = 0;
        // i = 0 + 2
        i = i++ + ++i; 
        int j = 0;
        // j = 1 + 1 + 2 + 3 = 7
        j = ++j + j++ + j++ + j++;
        int k = 0;
        // k = 0 + 1 + 2 + 4 = 7
        k = k++ + k++ + k++ + ++k;
        int h = 0;
        // h = 1 + 2
        h = ++h + ++h;
        int p1 = 0, p2 = 0;
        int q1 = 0, q2 = 0;
        // q1 = 1
        q1 = ++p1;
        // q2 = 0
        q2 = p2++;
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("k " + k);
        System.out.println("h " + h);
        System.out.println("p1 " + p1);
        System.out.println("p2 " + p2);
        System.out.println("q1 " + q1);
        System.out.println("q2 " + q2);
        
    }
}