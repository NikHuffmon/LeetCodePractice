package Array_String_Practice.Q88_MergeSortedArray;

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

/*
 * Consider Example: removeELement([3,2,2,3], 3)
 * p1 = 0;
 * p2 = 3
 * 
 * 1st Iteration:
 *  pt = 2
 * 
 * 2nd Iteration:
 *  nums = [2,2,3,3];
 * p2 = 1;
 * p1 = 1;
 * 
 * 3rd Iteration:
 * p2 = 0;
 * 
 * 4th Iteration: Fails
 * 
 * Return: p1 = 1
 * 
 */

/*
 * Consider Example: removeElement([3],3)
 * 
 * p1 = 0
 * p2 = 0
 * 
 * 1st Iteration:
 * p2 = -1;
 * 
 * 2nd Iteration: Fails
 * 
 * Return: p1 = 0
 */


 /*
  * Consider Example: removeElement([0,1,2,4,3,4,2,2,3,6], 3)
  *
  * p1 = 0;
  * p2 = 9;
  *
  * 1st Iteration:
  * p1 = 1
  *
  * 2nd Iteration:
  * p1 = 2
  *
  * 3rd Iteration:
  * p1 = 3
  *
  * 4th Iteration:
  * p1 = 4
  *
  * 5th Iteration:
  * p1 = 5
  * p2 = 8
  * nums = [0,1,2,4,6,4,2,2,3,3]
  *
  * 6th Iteration:
  * p2 = 7
  *
  * 7th Iteration:
  * p1 = 6
  *
  * 8th Iteration
  * p1 = 7
  *
  * 9th Iteration:
  * p1 = 8;
  *
  * 10th Iteration: Fails
  *
  * Returns: p1 = 8
  *
  */

