package Strings;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "aaabbccccddeeeee";
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int count=1;
        for(int i=1; i<n; i++){
            char current = s.charAt(i);//index i=1;
            char previous = s.charAt(i-1);//index i=0;
            if((int)current==(int)previous){ //comparing ascii value of current and previous character
                count++;
            }
            else{
                result.append(previous);
                result.append(count);
                count=1;
            }

        }
        //append last character of string
        result.append(s.charAt(n-1));
        result.append(count);
        System.out.println(result.toString());
    }
}
