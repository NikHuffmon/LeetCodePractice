package Two_Pointer_Practice.Q329_IsSubsequence_Esy;

class Solution {
    public boolean isSubsequence(String s, String t) {

        int pntr1 = 0;
        int pntr2 = 0;

        if(t.length() < s.length()) return false;

        while(pntr1 < s.length() && pntr2 < t.length()){
            if(t.charAt(pntr2) == s.charAt(pntr1)){
                pntr1++;
                pntr2++;
            } else{
                pntr2++;
            }
        }

        return (pntr1 == s.length());
        
    }
}

/*
 * Example:
 * s = "ace"
 * t = "applecarrotegg"
 * pntr1 = 0;
 * pntr2 = 0;
 * 
 * Iteration 1:
 * pntr1 = 1;
 * pntr 2 = 1;
 * 
 * Iteration 2:
 * pntr1 = 1;
 * pntr2 = 2;
 * 
 * Iteration 3:
 * pntr1 = 1; 
 * Pntr 2 = 3;
 * 
 * Repeat until Pointer 2 points at "e"
 * 
 * Then we can return true;
 * 
 */
