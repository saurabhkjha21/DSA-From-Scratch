package Strings;

public class ValidShiftedAlphabetString {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        System.out.println(validShiftedAlphabetString(s,n));
    }
    public static boolean validShiftedAlphabetString(String s, int n){
        for(int i=1; i<n; i++){
            char current = s.charAt(i);//current character
            char previous = s.charAt(i-1);//previous character
            if((int)current != (int)previous+1){ //next character is just greater than +1
                return false;
            }
        }
        return true;
    }
}
