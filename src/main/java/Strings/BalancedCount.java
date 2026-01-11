package Strings;

import java.util.HashMap;
import java.util.Scanner;

/* A character is balanced if:

1.It appears at least twice
2.The distance between first index and last index is EVEN
*/
public class BalancedCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Count Frequency
        HashMap<Character, Integer> firstIndex = new HashMap<>();
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!firstIndex.containsKey(ch)){
                firstIndex.put(ch, i);
            }
            lastIndex.put(ch, i);
        }


        int count=0;
        for(char ch : firstIndex.keySet()){
            int first = firstIndex.get(ch);
            int last = lastIndex.get(ch);
            if(first!=last && (last-first)%2==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
