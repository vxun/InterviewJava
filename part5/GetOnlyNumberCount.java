

/**
 * Consider a function which, for a given whole number n, 
 * returns the number of ones required when writing out all numbers between 0 and n.
 * 有一个整数n, 写一个函数f(n), 返回0-n之间出现的"1"的个数.比如 f(1) = 1, 
 * f(13) = 6(1, 10, 11, 12, 13一共6个1), 问一个最大的f(n) = n是什么?
 * 
 * 思路: f(n) = f(n-1) + 数字n包含的1的个数
 */
public class GetOnlyNumberCount {


    public static void main(String[] args) {
        System.out.println(getOnly(11));
    }

    public static int getOnly(int n) {
        if (n == 0) {
            return 0;
        }
        // 计算n包含的1的个数
        int count = 0;
        String nStr = "" + n;
        for (int i = 0; i < nStr.length(); i++) {
            char c = nStr.charAt(i);
            if (c == '1') {
                count++;
            }
        }
        return count + getOnly(n - 1);
    }


}