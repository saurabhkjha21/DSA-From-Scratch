package TwoPointers;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abaacababbc";
        int n = s.length();
        System.out.println(longestSubstringWithoutRepeatingCharacters(s,n));
    }
    public static int longestSubstringWithoutRepeatingCharacters(String s, int n){
        HashSet<Character> set = new HashSet<>();

        int left=0;//start of window
        int max=0;
        for(int right=0; right<n; right++){
            while(set.contains(s.charAt(right))){//check the character
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max, right-left+1);
        }
        return max;
    }

}
