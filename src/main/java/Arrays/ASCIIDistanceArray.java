package Arrays;
import java.util.*;
public class ASCIIDistanceArray {
    public static void main(String[] args) {
        String s = "acbcdaef";
        int n = s.length();
        System.out.println(aciiDistanceArray(s, n));


    }
    public static ArrayList<Integer> aciiDistanceArray(String s, int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            char c1 = s.charAt(i);//element at current index
            char c2 = s.charAt(i-1);// element at previous index
            int dist = Math.abs((int)c2 - (int)c1);//distance can't be negative so, use Math.abs() and it return non-negative number
            list.add(dist);
        }
        return list;
    }
}
