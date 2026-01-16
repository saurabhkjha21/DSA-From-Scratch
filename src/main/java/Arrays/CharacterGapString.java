package Arrays;

public class CharacterGapString {
    public static void main(String[] args) {
        String s = "acb";
        int n = s.length()-1;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            int diff = Math.abs((int)c1 - (int)c2);
            result.append(c1);
            result.append(diff);
        }
        result.append(s.charAt(s.length()-1));

        System.out.println(result.toString());
    }
}
