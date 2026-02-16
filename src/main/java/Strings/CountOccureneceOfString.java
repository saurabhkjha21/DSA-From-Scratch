package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccureneceOfString {
    public static void main(String[] args) {
        String[] arr = {"I", "am", "string", "who", "are", "you"};
        System.out.println(countOccurence(arr));

    }
    public static Map<String ,Integer> countOccurence(String[] arr){
        Map<String, Integer> map = new HashMap<>();
        for(String str: arr){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        return map;
    }
}
