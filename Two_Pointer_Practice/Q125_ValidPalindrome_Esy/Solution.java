package Two_Pointer_Practice.Q125_ValidPalindrome_Esy;

class Solution {
    public boolean isPalindrome(String s) {
        int pntr1 = 0;
        int pntr2 = s.length() - 1;

        while(pntr1 < pntr2){
            if(!Character.isLetter(s.charAt(pntr1)) && !Character.isDigit(s.charAt(pntr1))){
                pntr1++;
            } else if(!Character.isLetter(s.charAt(pntr2)) && !Character.isDigit(s.charAt(pntr2))){
                pntr2--;
            } else if(Character.toLowerCase(s.charAt(pntr1)) == Character.toLowerCase(s.charAt(pntr2))){
                pntr1++;
                pntr2--;
            } else{
                return false;
            }
        }

        return true;        
    }
}
/*
 * Example: rac0e, 0car
 * pntr1 = 0;
 * pntr2 = 10;
 * 
 * 1st Iteration:
 * pntr1 = 1;
 * pntr2 = 9;
 * 
 * 2nd Iteration:
 * pntr1 = 2;
 * pntr2 = 8;
 * 
 * 3rd Iteration:
 * pntr1 = 3;
 * pntr2 = 7;
 * 
 * 4th Iteration:
 * pntr1 = 4;
 * pntr2 = 6;
 * 
 * 5th Iteration:
 * pntr1 = 4; 
 * pntr2 = 5;
 * 
 * 6th Iteration:
 * pntr1 = 4;
 * pntr2 = 4;
 * 
 * 7th Iteration:
 * pntr1 = 5;
 * pntr2 = 3;
 * 
 * ENDS LOOP
 * return TRUE;
 */
