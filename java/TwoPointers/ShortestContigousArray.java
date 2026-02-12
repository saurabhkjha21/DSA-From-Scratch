package TwoPointers;

import java.util.*;

public class ShortestContigousArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,1};
        System.out.println(Arrays.toString(shortestSubArray(arr)));
    }
    public static int[] shortestSubArray(int[] arr){
        int n = arr.length;

        Set<Integer> st = new HashSet<>();
        for(int ele : arr){
            st.add(ele);
        }
        int rqd = st.size();

        Map<Integer, Integer> frq = new HashMap<>();
        int left=0, formed=0;

        int minL=Integer.MAX_VALUE;
        int ansL=0, ansR=0;

        for(int right=0; right<n; right++){
            frq.put(arr[right], frq.getOrDefault(arr[right], 0)+1);

            if(frq.get(arr[right])==1){
                formed++;
            }

            while(formed==rqd){
                if(right-left+1 <minL){
                    minL=right-left+1;
                    ansL=left;
                    ansR=right;
                }

                frq.put(arr[left], frq.get(arr[left])-1);
                if(frq.get(arr[left])==0){
                    formed--;
                }
                left++;

            }


        }
        return new int[]{ansL, ansR};


    }
}
