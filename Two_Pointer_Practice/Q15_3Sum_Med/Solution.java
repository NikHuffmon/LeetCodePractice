package Two_Pointer_Practice.Q15_3Sum_Med;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //Sorts our array!

        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; ++i){

            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int leftPtr = i + 1;
            int rightPtr = nums.length - 1;

            while(leftPtr < rightPtr){
                int sum = nums[leftPtr] + nums[rightPtr] + nums[i];

                if(sum == 0){
                    arr.add(Arrays.asList(nums[i], nums[leftPtr], nums[rightPtr]));

                    while(leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr +1]) leftPtr++;
                    leftPtr++;

                    while(rightPtr > leftPtr && nums[rightPtr] == nums[rightPtr - 1]) rightPtr--;
                    rightPtr--;
                } else if(sum < 0){
                    leftPtr++;
                } else{
                    rightPtr--;
                }
            }
        }

        return arr;
        
    }
}
