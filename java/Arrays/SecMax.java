package Arrays;

public class SecMax {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,10,7,5,9,12,11};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Second maximum element: "+secMax);
    }
}
