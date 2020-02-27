import java.util.*;

public class CombineNumber {

    public static void main(String[] args){
        List<String> s = new ArrayList<>();
        s.add("3");
        s.add("3");
        s.add("7");
        combine(s, "");
    }

    public static void combine(List<String> inputStr, String prefix) {
        
        for (int i = 0; i < inputStr.size(); i ++) {
            List<String> innerStr = new ArrayList<>(inputStr);
            String currentStr = innerStr.remove(i);
            String currentPrefix = prefix + currentStr;
            System.out.println("combine result = " + currentPrefix);
            combine(innerStr, currentPrefix);
        }

    }

}


