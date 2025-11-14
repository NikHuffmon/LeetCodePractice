package Q169_MajorityElement_Esy;
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();


        int n = nums.length;
        int maxNum = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
                if(map.get(num) > Math.floor(n/2)){
                    if(map.get(num) > maxNum){
                        maxNum = num;
                    }
                }
            } else{
                map.put(num, 1);
                if(map.get(num) > Math.floor(n/2)){
                    if(map.get(num) > maxNum){
                        maxNum = num;
                    }
                }
            }
        }

        return maxNum;
    }
}

/*
 * Consider Example: [2,2,1,1,1,2,2];
 * Initial map: Empty
 * n = 7
 * maxNum = 0;
 * 
 * First Iteration:
 * Map: {2 : 1}
 * 
 * Second Iteration:
 * Map: {2: 2}
 * 
 * Third Iteration:
 * Map: {2 : 2, 1 : 1}
 * 
 * Iterations Continue until...
 * Note that on the 5th iteration:
 * 
 * 7th Iteration:
 * Map: {2 : 4, 1 : 3}
 * maxNum = 2;
 * 
 * 
 */