import java.util.*;

/**
 * 数组的无重复组合(最大长度数组组合)
 */
public class FullCombineNumber{

    private static int count = 0;
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("3");
        s.add("3");
        s.add("7");
        combine(s, "");
    }

    private static void combine(List<String> inputStr, String prefix) {
        for (int i = 0; i < inputStr.size(); i ++) {
            // 其他的
            List<String> innerStr = new ArrayList<>(inputStr);
            String next = innerStr.remove(i);
            // System.out.println("next = " + next);
            // System.out.println("inner = " + innerStr);
            String s = prefix + next;
            if (inputStr.size() == 1) {
                count++;
                System.out.println("prefix = " + s + " count = " + count);
            }
            combine(innerStr, s);
        }
    }

}


