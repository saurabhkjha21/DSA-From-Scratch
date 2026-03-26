package Strings;

import java.util.Scanner;

public class CountConsonantAndVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] result = countVowelConsonant(str);
        System.out.println(result[0]);
        System.out.println(result[1]);





    }
    public static int[] countVowelConsonant(String str){
        int cons=0, vol=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);

            if("aeiou".indexOf(ch) != -1){
                vol++;
            }
            else{
                cons++;
            }
        }
        return new int[]{vol, cons};
    }
}
