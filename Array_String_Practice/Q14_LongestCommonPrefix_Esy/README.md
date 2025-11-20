# Solution Information
## Coding Pattern Used:
The coding pattern used here is technically Two-Pointers.
1. Pointer 1: Points at each string in the string array
2. Pointer 2: Points at each character we are going to compare.
    * This would be our k, so we are going to compare the same character across each string

Or, in other words, we are looping through each word, comparing each character in a specific index, to the first string index 0.

## What Did the Pattern Do:
The pattern handles pointing at each specific character, at the same index value across one whole loop of the array, 
and comparing it against the first string at the same character.
* If the character compared at the specific index at a string is the same character at the first string at the same index, then we move to the next string we are going to compare.
* If the character compared at the specific index at a string doesn't mater the same character at first string, end the loop.





## The idea:
The general rule and explanation of how the algorithm works.
1. Create a StringBuilder as this allows us to add to a string in O(1) complexity.
2. Loop through the entire array, and find the string that's the smallest length.
3. Loop through the entire array, checking specific comparisons...
    * If the string with character, at index k, is equal to the character at the first string at index k, then go to the next string (increment i)
    * If the string with character, at index k, is NOT equal to character at the first string at index k, then BREAK and return StringBuilder's toString()
4. When index i, has reached the end of the array...
    * Increment k, to check the next character in the strings.
    * Add the specific character, at the first string at index k, to the StringBuilder.
        * We know this is a valid prefix becuase it was checked against the entire array.
5. Additional Conditional...
* If our value k, which represents what index we need to check, is equal to the smallest length in the array...
    * We break out from the loop, and just return the StringBuilder toString() value.
       * We can do this because we know that any character checked after k, cannot be the prefix because its longer than the shortest length.



## Examples: See Solution.java for examples