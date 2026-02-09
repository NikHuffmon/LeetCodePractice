package Two_Pointer_Practice.Q167_TwoSumIISorted_Med;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pntr1 = 0;
        int pntr2 = numbers.length-1;

        while(pntr1 < pntr2){
            if(numbers[pntr1] + numbers[pntr2] == target){
                break;
            }
            else if(numbers[pntr1] + numbers[pntr2] < target){
                pntr1++;
            } else{
                pntr2--;
            }
        }

        return new int[]{pntr1+1, pntr2+1};
    }
}
