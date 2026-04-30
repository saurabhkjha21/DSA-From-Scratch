//2785. Sort Vowels in a String - LeetCode
//Time Complexity - O(n)
//Space Complexity - O(n)


class Solution {
    public String sortVowels(String s) {
        // Step 1: Extracts vowels
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                list.add(ch);
            }
        }
        //Step 2: sort it
        Collections.sort(list);

        //Step 3: Replace vowels in string 
        StringBuilder sb = new StringBuilder();
        int idx=0;

        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                sb.append(list.get(idx));
                idx++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static boolean isVowel(char  ch){

        
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
        ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        
        return false;
    }
}
