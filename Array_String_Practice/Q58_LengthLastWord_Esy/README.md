# Solution Information
## Coding Pattern Used:
In this code, the pattern used is just a Pointer.
1. This Pointer points to the end of the word, and moves to the beginning of the word until a specific condition is met.


## What Did the Pattern Do:
This pattern basically was a pointer that pointed to the end of the word.
* This pointer is used to check the character at each point in the string.


## The idea:
* We create a variable count, that keeps count of the length of the word/string that is the last word we are counting the length of
* We create our pointer that points to a blank space, we continue the loop and decrement the pointer.
* However, there are Specific Conditions
    * If count > 0, then that means we have seen a word already.
        * If the pointer then points to a blank space, after count, we have passed the word, and therefore can return
    * If count = 0, then that means we have NOT reached a word yet.
        * We continue to decrement the pointer


## Examples: See Solution.java for examples