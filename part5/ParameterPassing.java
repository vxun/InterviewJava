import java.lang.*;
import java.util.*;

public class ParameterPassing {
    /**
     * 基本类型,传递值得副本,方法内改变参数值,不会影响到方法外
     * @param test
     */
    public static void test(boolean test) {
        test = !test;
        System.out.println("In test(boolean) : test = " + test);
    }

    public static void test(Boolean test) {
        test = !test;
        System.out.println("In test(Boolean): test = " + test);
    }

    /**
     * String类型为传引用副本,但是String是不可变类型,所以方法内的改变不会影响方法外
     */
    public static void test(String test) {
        test = test + "abc";
        System.out.println("In test(String): test = " + test);
    }

    public static void test(StringBuilder test) {
        test = test.append("str");
        System.out.println("In test(StringBuilder): test = " + test);
    }

    public static void main(String[] args) {
        boolean test = true;
        System.out.println("Before test(boolean): test = " + test);
        test(test);
        System.out.println("After test(boolean): test = " + test);

        System.out.println("===============");
        Boolean testObj = true;
        System.out.println("Before test(Boolean): testObj = " + testObj);
        test(testObj);
        System.out.println("After test(Boolean): testObj = " + testObj);


        System.out.println("===============");
        String testStr = "aaa";
        System.out.println("Before test(String): testStr = " + testStr);
        test(testStr);
        System.out.println("After test(String): testStr = " + testStr);

        System.out.println("===============");
        StringBuilder testSb = new StringBuilder("sb");
        System.out.println("Before test(StringBuider): testSb = " + testSb);
        test(testSb);
        System.out.println("After test(StringBuider): testSb = " + testSb);
    }
}