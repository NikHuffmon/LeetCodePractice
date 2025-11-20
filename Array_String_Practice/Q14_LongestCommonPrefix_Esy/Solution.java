package Q14_LongestCommonPrefix_Esy;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();

        int longest = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; ++i){
            longest = Math.min(strs[i].length(), longest);
        }

        int k = 0;
        for(int i = 0; i < strs.length; ++i){
            if(k == longest){
                break;
            }
            if(strs[0].charAt(k) == strs[i].charAt(k)){
                if(i == strs.length-1){
                    str.append(strs[0].charAt(k));
                    i = 0; //Could set it to 1 if we wanted;
                    k++;
                } else{
                    continue;
                }
            } else{
                break;
            }
        }

        return str.toString();


    }
}

/*
 * Consider Example: [flower, fleg, flowering]
 * longest = 4
 * k = 0;
 * Str = new StringBuilder();
 * 
 * 1st Iteration:
 * i = 0;
 * k = 0;
 * strs[0].charAt(k) = f;
 * strs[i].charAt(k) = f;
 * 
 * 2nd Iteration:
 * k = 0;
 * i = 1;
 * strs[0].charAt(k) = f;
 * strs[i].charAt(k) = f;
 * 
 * 3rd Iteration:
 * k = 0;
 * i = 2;
 * strs[0].charAt(k) = f;
 * strs[i].charAt(k) = f;
 * 
 * str = "f";
 * i = 0;
 * k = 1;
 * 
 * 4th Iteration:
 * i = 0;
 * k = 1;
 * strs[0].charAt(k) = l;
 * strs[i].charAt(k) = l;
 * 
 * 5th Iteration:
 * i = 1;
 * k = 1;
 * strs[0].charAt(k) = l;
 * strs[i].charAt(k) = l;
 * 
 * 6th Iteration: 
 * i = 1;
 * k = 1;
 * strs[0].charAt(k) = l;
 * strs[i].charAt(k) = l;
 * 
 * str = "fl";
 * i = 0;
 * k = 2;
 * 
 * 7th Iteration:
 * i = 0;
 * k = 2;
 * str[0].charAt(k) = o;
 * str[i].charAt(k) = o;
 * 
 * 8th Iteration:
 * i = 1;
 * k = 2;
 * str[0].charAt(k) = o;
 * str[i].charAt(k) = e;
 * 
 * The Loop Breaks because str[0].charAt(k) != str[i].charAt(k);
 * 
 * Return str.toString() = "fl".
 * 
 * 
 */
