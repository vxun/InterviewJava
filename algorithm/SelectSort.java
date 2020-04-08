import java.util.Arrays;

/**
 * 选择排序.
 * 每次遍历,都将数组中最小值与第一个值交换位置. 依次迭代遍历剩余的元素部分
 * 1. N个元素组成的数组
 * 2. 第一次遍历, 将[0, N-1]索引处的N个元素中,最小的值与第1个元素交换位置.
 * 3. 第二次遍历, 将[1, N-1]索引处的N-1个元素中,最小值与第2个元素交换位置.
 * ...
 * N-1. 第N-1次遍历, 将[N-2, N-1]索引出的2个元素中,最小值与第N-1个元素交换位置
 * 
 * 时间复杂度:
 * O(N^2)
 */
public class SelectSort {

    public static void sort(Comparable[] c) {
      for (int i = 0; i < c.length - 1; i++) {
          //假设当前子数组中最小的元素索引为i
          int minIdx = i;
          for (int j = i + 1; j < c.length; j++) {
              Comparable minElement = c[minIdx];
              Comparable nextElement = c[j];
              if (minElement.compareTo(nextElement) > 0) {
                  minIdx = j;
              }
          }
          // 将当前数组中的最小值放到子数组中的首位
          Comparable tmp = c[minIdx];
          c[minIdx] = c[i];
          c[i] = tmp;
          System.out.println(String.format("第%s次选择排序: %s", i + 1 + "", Arrays.asList(c)));
      }      
    }
    public static void main(String[] args) {
        Integer[] d = new Integer[]{5, 7, 9, 6, 4, 3, 1};
        sort(d);
    }
}