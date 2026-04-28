//Print all subsequences of a string
// Time Complexity=O(n * 2^n)
// Space Complexity=O(n * 2^n)
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "Saurabh";
        List<String> res = subsequence(s);
        
        for(String str : res){
            System.out.println(str);
        }
      
    }
    public static List<String> subsequence(String s){
        List<String> list = new ArrayList<>();
        list.add("");
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int size = list.size();
            for(int j=0; j<size; j++){
                list.add(list.get(j)+ch);
            }
        }
        return list;
        
    }
}
