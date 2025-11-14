package Q88_RemoveDuplicatedSortedArray2_Med;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int pt1 = 0; //What is going to be returned...eventually :)
        int pt2 = pt1+1;


        while(pt2 < nums.length){
            if(map.containsKey(nums[pt1]) && map.get(nums[pt1]) >= 2){
                if(map.containsKey(nums[pt2]) && map.get(nums[pt2]) >= 2){
                    pt2++;

                } else{
                    map.put(nums[pt2], map.getOrDefault(nums[pt2], 0) + 1);
                    int temp = nums[pt1];
                    nums[pt1] = nums[pt2];
                    nums[pt2] = temp;
                    pt1++;
                    pt2++;
                }
            } else{
                map.put(nums[pt1], map.getOrDefault(nums[pt1], 0) + 1);
                pt1++;
                pt2++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return pt1;            
    }

    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,1,2,3,4,1,2,3}));


    }
}
