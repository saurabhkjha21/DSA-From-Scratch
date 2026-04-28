// Subsequence equal to target
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums = {3,5,6,7};
        int target = 9;
        List<List<Integer>> result = new ArrayList<>();
        subsequence(0, nums, target,0, new ArrayList<>(), result);
        System.out.println(result);
    }
    public static void subsequence(int idx, int[] nums, int target, int sum,List<Integer> current,  List<List<Integer>> result){
        
        if(idx==nums.length){//base condition
            if(sum==target){
                result.add(new ArrayList<>(current));
            }
            return ;
        }
        
        current.add(nums[idx]);//pick
        subsequence(idx+1, nums, target,sum+nums[idx], current, result);
        current.remove(current.size()-1);//backtrack
        subsequence(idx+1, nums, target,sum, current, result);//not pick
        
    }
}
