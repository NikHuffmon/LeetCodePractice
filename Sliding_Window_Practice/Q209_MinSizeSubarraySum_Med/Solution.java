package Sliding_Window_Practice.Q209_MinSizeSubarraySum_Med;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int pt1 = 0;
        int pt2 = 0;
        int subSize = Integer.MAX_VALUE;
        int total = 0;
        

        while(pt2 < nums.length){
            total+= nums[pt2];

            while(total >= target){
                subSize = Math.min(subSize, pt2 - pt1+1);
                total-=nums[pt1];
                pt1++;
            }
            pt2++;
        }

        return subSize == Integer.MAX_VALUE ? 0 : subSize;
    }
}
