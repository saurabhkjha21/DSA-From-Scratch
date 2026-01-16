package Arrays;

public class MirrorCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,3,2,1};
        int n =arr.length;
        System.out.println(mirrorCheck(arr, n));

    }
    public static boolean mirrorCheck(int[] arr, int n){
        if(n%2==0) return false;
        int start=0, end=n-1;
        while(start<end){
            if(arr[start]!=arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
