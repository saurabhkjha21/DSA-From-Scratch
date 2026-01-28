package Arrays;

public class LeftDominantCount {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 3, 2, 5};
        int count=0;

        for(int i=0; i<arr.length; i++){
            int leftSmaller=0;
            int rightGreater=0;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    leftSmaller++;
                }
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    rightGreater++;
                }
            }
            if(leftSmaller>rightGreater) count++;

        }

        System.out.println("Count:" +count);
    }
}
