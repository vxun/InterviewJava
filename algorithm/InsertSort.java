import java.util.Arrays;

/**
 * 插入排序
 * 1. 假设前面的M个元素是已经排好序的 
 * 2. 将第M+1个元素依次向前比较, 如果比前面的元素, 则交换两者的元素
 * 3. 直到多有的元素都排序完
 */
public class InsertSort {


    public static void sort(Comparable[] c) {
        for (int i = 1; i < c.length; i ++) {
            // 假设前i个元素已经排好序, 用第i+1个元素,依次与前面的比较
            for ( int j = i; j > 0; j--) {
                Comparable next = c[j];
                Comparable pre = c[j - 1];
                if (next.compareTo(pre) < 0) {
                    Comparable tmp = next;
                    c[j] = pre;
                    c[j-1] = tmp;
                } else {
                    break;
                }
            }
            System.out.println(String.format("第%s次插入, 结果为: %s", i, Arrays.toString(c)));
        }
    }

    public static void main(String[] args) {
        Integer[] test = {5, 7, 9, 6, 4, 3, 1};
        sort(test);
    }

}