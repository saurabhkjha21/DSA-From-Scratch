//434. Number of Segments in a String - LeetCode
//Time Complexity = O(n)
//Space Complexity = O(n)

class Solution {
    public int countSegments(String s) {
        // if(s.length()==0) return 0;
        int n = s.length();
        int count=0;
        for(int i=0; i<s.length(); i++){
            // char ch = s.charAt(i);
           if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                count++;
           }
        }
        return count;

        

        // int count=0;
        // String[] words = s.trim().split("\\s+");
        // for(String word: words){
        //     System.out.println(word);
        //     count++;
        // }
        // return count;
    }
}
