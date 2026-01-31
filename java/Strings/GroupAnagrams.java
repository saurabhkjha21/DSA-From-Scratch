package Strings;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
       String[] strs =  {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsApproach1(strs));
        System.out.println(groupAnagramsApproach2(strs));

    }
    /*
    Time Complexity: O(n * k log k)
    Space Complexity: O(n * k)
     */
    public static List<List<String>> groupAnagramsApproach1(String[] strs){

        Map<String, List<String>> map = new HashMap<>();
        //String -> store sorted version of string
        //Lis<String> -> stores the original strings

        for(String s : strs){
            /*Step1: 1.convert into character array
            2.sort the character array
            3.convert back to new String
             */

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            /*Step 2:
            1.check map contains the key
            a. if not then, create new list then add to list
            2. otherwise add to list directly
             */

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
            
        }
        /* return new list with map values

         */
        return new ArrayList<>(map.values());

    }

    public static List<List<String>> groupAnagramsApproach2(String[] strs){
        if(strs.length==0 || strs==null){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            /*
            Step 1: a. create a frequency array
            b.count characters
             */
            int[] frq = new int[26];//create frq array of 26

            //count characters
            for(char ch : s.toCharArray()){
                frq[ch - 'a']++;
            }
            /*
            Step 2 :
             */

            StringBuilder keyBuilder = new StringBuilder();
            for(int i=0; i<26; i++){
                keyBuilder.append("#");
                keyBuilder.append(frq[i]);
            }

            String key = keyBuilder.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
