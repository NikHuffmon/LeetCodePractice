package Array_String_Practice.Q27_RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int p1 = 0;
        int p2 = nums.length-1;

        while(p1 <= p2){
            if(nums[p2] == val){
                p2--;
            } else{
                if(nums[p1] == val){
                    int temp = nums[p1];
                    nums[p1] = nums[p2];
                    nums[p2] = temp;
                    p1++;
                    p2--;
                } else{
                    p1++;
                }
            }
        }

        return p1;
        
    }
}
