# Solution Information
## Coding Pattern Used:
The pattern we used in this case was **Two Pointer Patter**


## What Did the Pattern Do:
This pattern allowed us to walk both strings: ***s*** and ***t***
* We were able to compare each character in both strings, to meet specific conditions.

Each pointer pointed to a specific string.
1. Pointer 1: Was used to walk down ***s***
2. Pointer 2: Was used to walk down ***t***



## The idea:
The idea behind this problem is that ***s*** is a subsequence of ***t***
* This means that s is contained in ***t*** by removing any, if not all other characters that are not in s.
* See example below for a better understanding.

Therefore, the idea comes in moving our two pointers down each string, until we can confirm s is in t...
* If the characters at pointers 1 and 2 are equal we will increment both pointers.
* If the characters at pointers 1 and 2 are NOT equal, we will increment pointer 2.

We determined our return point by checking if Pointer 1 was equal to the length of ***s***
* We can determine this because if Pointer 1 wasn't at length ***s*** then we know that not all the characters were found in ***t*** or at least in the correct order.
* Even if both Pointer and Pointer 2 were at their respective final lengths, we could still confirm that ***s*** is a subsequence of ***t***.


## Time and Space Complexity:
1. Time: O(n+m)
    * Where n is our length of ***s***
    * Where m is our length of ***t***
2. Space: O(1)
    * We are using integer variables, are primitive types.



## Examples: See Solution.java for examples