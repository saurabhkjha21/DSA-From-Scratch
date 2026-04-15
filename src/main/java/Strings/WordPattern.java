//290. Word Pattern - LeetCode
//Time Complexity = O(n)
//Space Complexity = O(n)



class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        String[] words = s.trim().split("\\s+");

        if(pattern.length() != words.length) return false;

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) return false;
            }else{
                map.put(ch, word);
            }

            if(reverseMap.containsKey(word)){
                if(!reverseMap.get(word).equals(ch)) return false;
            }else{
                reverseMap.put(word, ch);
            }
        }
        return true;

        
    }
}
