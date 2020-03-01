

/**
 * 无重复数组排列组合
 */
public class CombineWoDuplication{


    public static void main(String[] args) {
        combine("acad", "");
    }

    public static void combine(String inputStr, String prefixStr) {
        if (inputStr.length() < 1) {
            
        } else {
            int[] index = new int[inputStr.length()];
            for (int i = 0; i < inputStr.length(); i++) {
                index[i] = inputStr.indexOf(inputStr.charAt(i));
            }
            for (int i = 0; i < inputStr.length(); i++) {
                if (i == index[i]) {
                    System.out.println("prefixStr = " + prefixStr);
                    combine(inputStr.substring(1), prefixStr + inputStr.substring(0,1));
                }
            }
        }
    }


}