import java.util.Arrays;

/**
 * 冒泡排序.
 * 冒泡排序原理.
 * 1. 对数组中的n个元素, 从第一个元素开始, 第一个元素与第二个元素比较大小.
 * 2. 如果第一个元素比第二个元素大, 则交换第一个元素与第二个元素的顺序.
 * 3. 再比较第二个元素与第三个元素的大小.
 * 4. 如果第二个元素比第三个元素大, 则交换第二个元素与第三个元素的顺序.
 * 5. 依次比较, 直到数组结束
 * 6. 此时,最大的一个元素,已经冒泡到数组的最右边(n-1)
 * 7. 再对前n-1个元素,依次执行1-6, 直到所有的元素都执行完
 */
public class BubbleSortor {


    /**
     * 迭代冒泡排序
     */
    public static void loopSort(Comparable[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length -1 - i; j ++) {
                Comparable pre = c[j];
                Comparable next = c[j + 1];
                if (pre.compareTo(next) > 0) {
                    Comparable tmp = pre;
                    c[j] = next;
                    c[j + 1] = tmp;
                }
            }
        }
    }



    /**
     * 迭代冒泡排序, 迭代的出口为最终需要冒泡的子数组长度为0
     * @param c
     * @param lenght
     */
    public static void iterateSort(Comparable[] c, int lenght) {
        if (lenght > 0) {
            for (int i = 0; i < lenght - 1; i ++) {
                Comparable pre = c[i];
                Comparable next = c[i + 1];
                if (pre.compareTo(next) > 0) {
                    Comparable tmp = pre;
                    c[i] = next;
                    c[ i + 1] = tmp;
                }
            }
            // 迭代下一个子数组
            iterateSort(c, --lenght);
        }
    }


    public static void main(String[] args) {
        Integer[] d = new Integer[]{4,3,1,2,5,67,1};
        iterateSort(d, d.length);
        System.out.println(Arrays.asList(d));
    }

}
