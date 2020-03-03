
public class Example7 {
    public static void main(String[] args) {
        short s = 1;
        // s = s + 1; 编译报错, int不能直接赋值给short
        s += 1;
        System.out.println(s);
    }
}