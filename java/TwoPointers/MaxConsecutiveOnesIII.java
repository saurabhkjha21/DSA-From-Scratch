package TwoPointers;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int result = max_consecutive_onesBF(arr, k);
        System.out.println(result);
        int ans = maxConsecutiveOnes(arr, k);
        System.out.println(ans);
    }
    public static int max_consecutive_onesBF(int[] arr, int k){
        int n = arr.length;
        int maxLen=0;
        for(int i=0; i<n; i++){//start of sub-array
            int zeroes=0;
            for(int j=i; j<n; j++){//start of sub-array
                if(arr[j]==0) zeroes++;
                if(zeroes<=k){//if zeroes exceeds k
                    int len=j-i+1;
                    maxLen=Math.max(maxLen, len);
                }
            }
        }
        return  maxLen;
    }
    public static int maxConsecutiveOnes(int[] arr, int k){
        int n =arr.length;
        int l=0;//start of sub-array
        int maxLen=0, zeroes=0;
        for(int r=0; r<n; r++){//end of sub-array
            if(arr[r]==0) zeroes++;//count zeroes
            while(zeroes>k){//if zeroes exceeds k, then shrink window
                if(arr[l]==0) zeroes--; //if next element is zero then, reduce zeroes
                l++;//shrink the window by moving l forward
            }
            int len = r-l+1;//fixed window size
            maxLen=Math.max(len, maxLen);
        }
        return maxLen;
    }
}
