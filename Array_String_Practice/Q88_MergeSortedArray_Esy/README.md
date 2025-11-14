# Solution Information
## Coding Pattern Used:
Two Pointers Method was used for the solution of this program.
1. Pointer 1: Was used to point at the front most index of the array
2. Pointer 2: Was used to point at the last index of the array

## What Did the Two-Pointers do:
The Pointers worked together to basically sort the array.
Elements are are NOT equal to val are towards the begining of the array.
Elements that are EQUAL to val are towards the end of the array.

## The idea:
We know that if there are k-elements in the array that are equal to val, then we know the length
of the array that cotains values that are NOT equal to val is array.length - k.

Then, we can use our Two-Pointer method to handle moving the elements in the array, while
maintaing a form of sorted order: 
* (Elements that are NOT val in beginning, and elements that are val in the end).

## Examples: See Solution.java for examples
