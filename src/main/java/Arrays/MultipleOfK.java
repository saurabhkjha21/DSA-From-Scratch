package Arrays;

public class MultipleOfK {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,3,4,5,6};
        int res = mulValuePairs(arr);
        System.out.println(res);

    }
    public static int mulValuePairs(int[] arr){
        int[] frq = new int[6];

        for(int ele : arr){
            frq[ele%6]++;
        }

        int count =0;

        count+=frq[0]*(frq[0]-1)/2;
        count+=frq[1]*frq[5];
        count+=frq[2]*frq[4];
        count+=frq[3]*(frq[3]-1)/2;

        return count;

    }
}
