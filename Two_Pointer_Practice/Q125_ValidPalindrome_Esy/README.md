# Solution Information
## Coding Pattern Used:
This problem uses **Two-Pointer Pattern**
In this problem, we refer to alphanumeric which means...
* Numbers: 0 - 8
* Alphabet: A - Z, a - z


## What Did the Pattern Do:
The pattern establishes **Two-Pointers**
1. Pointer 1: Starts at the 0th index of our string
2. Pointer 2: Starts at the last index of our string

These pointers will compare each alphanumeric character against each other.


## The idea:
These pointers will walk towards each other...
1. Pointer 1 will move towards the right in our string.
2. Pointer 2 will move towards the left in our string.

The character at each pointer will face specific conditions...
* If the character at each pointer is the same alphanumeric character, then we will increment our pointers in their respective ways.
    * Pointer 1 increments
    * Pointer 2 decrements
    
* In our comparisons, we will be comparing the strings which we must do in terms of lowercase values.
    * We will have to convert our strings to lower-case so we can compare A to a, B to b, etc.

* If these conditions are not met...
    * We can instantly return false as it is clearly not a palindrome.

* If we don't return false throughout our loop, we know its a palindrome and can thus return true at the end.

## Time Complexity:
1. Time: O(n)
    * Where n is the length of ***s***
    * Therefore, the worst case is we go the entire length of n

2. Space: O(1)
    * We are using primitive types, therefore we are doing no extra space allocations.


## Examples: See Solution.java for examples