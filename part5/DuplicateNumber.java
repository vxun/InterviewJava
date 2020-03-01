import java.util.*;

/**
 * 快慢指针,找出重复字符串
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(6);
        s.add(6);
        s.add(10);
        s.add(8);
        findMaxDuplicateNumber(s);
    }

    public static void findMaxDuplicateNumber(List<Integer> inputNumber) {
        int maxDuplicateCount = 0;
        int fastIdx = 0;
        int slowIdx = 0;
        List<Integer> maxDuplicateIdx = new ArrayList<>();
        // 先排序
        Collections.sort(inputNumber);
        for (fastIdx = 0; fastIdx < inputNumber.size(); fastIdx++) {
            int fastValue = inputNumber.get(fastIdx);
            int slowValue = inputNumber.get(slowIdx);
            if (fastValue != slowValue) {
                int duplicateCount = fastIdx - slowIdx;
                if (duplicateCount > maxDuplicateCount) {
                    maxDuplicateIdx.clear();
                    maxDuplicateIdx.add(slowIdx);
                    maxDuplicateCount = duplicateCount;
                }
                if (duplicateCount == maxDuplicateCount) {
                    maxDuplicateIdx.add(slowIdx);
                }
                slowIdx = fastIdx;
            } else {

            }
        }
        System.out.println("max duplicate count = " + maxDuplicateCount);
        System.out.println("max duplicate idx = " + maxDuplicateIdx);
    }

}