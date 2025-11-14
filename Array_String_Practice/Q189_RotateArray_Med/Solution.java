package Q189_RotateArray_Med;

//We have provided 2 different solutions
class Solution {
    /*
     * Solution 1: This is O(n) runtime and O(n) space-complexity.
     */
    public void rotate(int[] nums, int k) {
        
        int[] roatedProperly = new int[nums.length];

        k = k % nums.length;

        for(int i = 0; i < nums.length; ++i){
            roatedProperly[(i + k) % nums.length] = nums[i];
        }

        for(int i = 0; i < nums.length; ++i){
            nums[i] = roatedProperly[i];
        }  
    }


    /*
     * Solution 2: This is O(n) runtime and O(1) space-complexity
     */
    public void rotate_solution_two(int[] nums, int k){
        //Want to reverse the entire array
        //Then reverse n-k
        //then reverse k element
        int n = nums.length;
        k = k % nums.length;
        
        reverse(nums, 0, n-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, k-1);
    }
    
    /*
     * Helper Function
     */
    public void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
