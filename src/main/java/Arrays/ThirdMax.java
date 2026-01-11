package Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {1,9,3,6,0,-1,9,21,12,34,22};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                thirdMax=secMax;
                secMax=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>secMax) {
                thirdMax=secMax;
                secMax=arr[i];
            } else if (arr[i]<secMax && arr[i]>thirdMax) {
                thirdMax=arr[i];
            }
        }
        System.out.println("Max Element: "+max);
        System.out.println("Second Max Element: "+secMax);
        System.out.println("Third Max Element: "+thirdMax);
    }


}
