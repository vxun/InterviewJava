import java.util.Arrays;

/**
 * 希尔排序
 * 基本思想:
 * 1. 先将数组按照步长step拆分成若干个部分
 * 2. 依次将第i个元素与第i+step, i+2*step...个元素比较大小,互换
 * 3. 减小步长,重复操作2,直至步长为1
 */
public class ShellSort {

    public static void sort(Comparable[] c) {
        // 定义初始步长
        int count = 0;
        for (int step = c.length / 2 + 1; step > 0; step = step / 2 ){
            for (int i = step; i < c.length; i ++) {
                // 从c[i]元素开始, 插入到c[i-step], c[i-2step]的序列中, 使用插入排序
                for (int j = i; j >= step; j-=step) {
                    Comparable pre = c[j - step];
                    Comparable next = c[j];
                    if(pre.compareTo(next) > 0) {
                        Comparable tmp = pre;
                        c[j-step] = next;
                        c[j] = tmp;
                    } else {
                        // 同一组内的元素,前面的顺序已经排好, 当遇到比改元素小的元素时,改组插入排序完毕
                        break;
                    }
                    System.out.println(String.format("第%s次排序, 结果: %s", ++count, Arrays.toString(c)));
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] test = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(test);
    }

}