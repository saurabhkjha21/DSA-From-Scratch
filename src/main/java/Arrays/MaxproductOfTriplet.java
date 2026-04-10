//Three Great Candidates -GFG
//Time Complexity = O(n)
//Space Complexity = O(1)


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {0,-1,9,-2,4,5,6,-2};
//   maxProduct(arr);
        System.out.println("Max product: "+maxProduct(arr));
    }
    public static int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int maxC=Integer.MIN_VALUE;
        
        int minA=Integer.MAX_VALUE;
        int minB=Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i]>maxA){
                maxC=maxB;
                maxB=maxA;
                maxA=arr[i];
            }
            else if(arr[i]>maxB){
                maxC=maxB;
                maxB=arr[i];
                
            }
            else if(arr[i]>maxC){
                maxC=arr[i];
            }
            
            if(arr[i]<minA){
                minB=minA;
                minA=arr[i];
            }
            else if(arr[i]<minB){
                minB=arr[i];
            }
        }
        
        return Math.max(maxA*maxB*maxC, maxA*minA*minB);
    }
}
