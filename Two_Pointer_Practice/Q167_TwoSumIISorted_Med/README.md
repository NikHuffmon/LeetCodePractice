# Solution Information
## Coding Pattern Used:
The pattern used for this program is **Two Pointer Pattern**


## What Did the Pattern Do:
This pattern used **Two Pattern** approach...
1. Pointer 1: Points to the first index of the array
2. Pointer 2: Points to the last index of the array


## The idea:
This pattern allowed us to walk both pointers towards each other...
1. Pointer 1 incremented to the right.
2. Pointer 2 decremented to the left.

Each pointer faces specific conditionals...
* If the values at Pointer 1 + Pointer 2 are less than target...
    * Then we incremented Pointer 1 as we know the array is already sorted and therefore larger numbers are on the right.
* If the values at Pointer 1 + Pointer 2 are greater than target...
    * Then we decremented Pointer 2 as we know the array is already sorted and therefore smaller numbers are on the left.
* If the values at Pointer 1 + Pointer 2 = target, then we break from the array

Since this problems incorporates in a 1-indexed array, we will return {Pointer 1 + 1, Pointer 2 + 1}

## Time Complexity:
1. Time: O(n)
    * Worst case scenario we are walking the entire array with our pointers.

2. Space: O(1)
    * We are using strictly primitive types


## Examples: Solution is identical to Two Sum, so see problem Two-Sum.