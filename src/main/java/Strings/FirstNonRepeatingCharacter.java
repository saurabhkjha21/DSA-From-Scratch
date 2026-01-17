package Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        System.out.println("First Non-Repeating Character: ");
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int count =0;
            for(int j=0; j<n; j++){
                if((int)s.charAt(j)==(int)ch){
                    count++;
                }
            }

            if(count==1){
                System.out.println(s.charAt(i));
                return;
            }
        }

    }
}
