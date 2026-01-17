package Arrays;

public class ArrayBreakPoint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        System.out.print(arrayBreakPoint(arr));
    }
    public static int arrayBreakPoint(int[] arr){
        int n= arr.length;
        int totalSum=0;
        //get total sum
        for(int ele : arr){
            totalSum+=ele;
        }

        int leftSum=0;
        for(int i=0; i<n; i++){
            int rightSum=totalSum-leftSum-arr[i]; //totalSum=leftSum+arr[i]+leftSum ....just rearrange calculation logic
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i]; // after everytime comparison add array of element to leftSum for next iteration comparison
        }
        return -1;
    }
}
