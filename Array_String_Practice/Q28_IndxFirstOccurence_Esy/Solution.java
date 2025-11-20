package Q28_IndxFirstOccurence_Esy;
import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        Queue<Integer> indxQueue = new LinkedList<>();


        for(int i = 0; i < haystack.length(); ++i){
            if(haystack.charAt(i) == needle.charAt(0)){
                indxQueue.add(i);
            }
        }

        if(haystack.length() < needle.length() || indxQueue.isEmpty()){
            return -1;
        }

        int pntr1 = indxQueue.peek();
        int pntr2 = 0;

        while(indxQueue.size() != 0 && pntr2 < needle.length() && pntr1 < haystack.length()){
            if(haystack.charAt(pntr1) == needle.charAt(pntr2)){
                pntr1++;
                pntr2++; 
            } else{
                pntr2 = 0;
                indxQueue.remove();
                if(indxQueue.size() > 0){
                    pntr1 = indxQueue.peek();
                }
            }
        }

        if(pntr2 == needle.length() && indxQueue.size() > 0){
            return indxQueue.remove();
        } else{
            return - 1;
        }

        
    }
}

/*
 * Example:
 * haystack = apple
 * needle = goodbye
 * Queue = [];
 * 
 * We know that haystack.length() < needle.length() so we can just end instantly.
 * 
 * Example:
 * haystack = sabutsad
 * needle = sad
 * Queue = [] ...
 * Queue = [0, 5]
 * 
 * pntr1 = 0;
 * pntr2 = 0
 * 1st Iteration:
 * pntr1 = 1;
 * pntr2 = 1;
 * 
 * 2nd Iteration:
 * pntr1 = 2;
 * pntr2 = 2;
 * 
 * 3rd Iteration;
 * Queue = [5]
 * pntr1 = 5;
 * pntr2 = 0;
 * 
 * 4th Iteration;
 * pntr1 = 6;
 * pntr2 = 1;
 * 
 * 5th Iteration:
 * pntr1 = 7;
 * pntr2 = 2;
 * 
 * 6th Iteration:
 * pntr1 = 8;
 * pntr2 = 3;
 * 
 * 7th Iteration;
 * Loop ends
 * pntr2 = 3 = needle.length
 * Queue.size() > 0
 * 
 * return queue.remove() = 5;
 * 
 */
