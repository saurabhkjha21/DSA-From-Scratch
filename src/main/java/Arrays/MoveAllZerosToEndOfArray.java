//Move all Zeros to End of Array
//Time Complexity = O(n)
//Space Complexity = O(n)
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n =arr.length;
        int j=0;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                res[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            res[j++]=0;
        }
        for(int i=0; i<n; i++ ){
            arr[i]=res[i];
        }
        
        
    }
}


class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n =arr.length;
        int j=0;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                res[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            res[j++]=0;
        }
        for(int i=0; i<n; i++ ){
            arr[i]=res[i];
        }
        
        
    }
}
