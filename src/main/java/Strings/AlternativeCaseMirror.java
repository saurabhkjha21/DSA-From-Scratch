package Strings;

public class AlternativeCaseMirror {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(alternateCaseMirror(s));

    }
    public static String alternateCaseMirror(String s){
        int left=0, right=s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(left<right){
            char c1 = s.charAt(left);
            char c2=s.charAt(right);
            //to upper case
            if ((int)c1 >= 97 && (int)c1 <= 122) {
                sb.append((char)((int)c1 - 32));
            } else {
                sb.append(c1);
            }
            //to lowercase
            if((int)c2 >= 65 && (int)c2 <= 90){
                sb.append((char)((int)c2 + 32));
            }else{
                sb.append(c2);
            }
            left++;
            right--;
        }
        //handle middle element for odd length
        if(left==right){
            sb.append((char)((int)s.charAt(left)-32));
        }
        return sb.toString();

    }
}
