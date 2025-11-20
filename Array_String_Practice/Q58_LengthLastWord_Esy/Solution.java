package Q58_LengthLastWord_Esy;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for(int pt = s.length() - 1; pt >= 0; pt--){
            if(s.charAt(pt) == ' '){
                if(count > 0){
                    break;
                } else{
                    continue;
                }
            } else{
                count++;
            }
        }

        return count;
        
    }
}

/*
 * Consider Example: s = "Hello World!    "
 * count = 0;
 * pt = 15 (the end of the string) Please note, there are spaces at the end
 * 
 * 1st Iteration;
 * pt = 14
 * 
 * 2nd Iteration:
 * pt = 13
 * 
 * 3rd Iteration:
 * pt = 12
 * count = 1
 * 
 * 4th Iteration:
 * pt = 11
 * count = 2
 * 
 * 8th Iteration:
 * pt = 7
 * count = 6
 * 
 * 9th Iteration:
 * pt = 6
 * 
 * Return count as pt points to a empty space again
 */
