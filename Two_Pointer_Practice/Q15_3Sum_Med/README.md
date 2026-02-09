# Solution Information
## Coding Pattern Used:
The pattern used for this problem was the **Two-Pointer Pattern**


## What Did the Pattern Do:
The pattern allowed us to point to specific values in our array, and compare if those values reached our specific conditionals.
* Reached a value of 0
* Values were not duplicates of each other



## The idea:
One of the biggest things we have to deal with is duplicate numbers, as we don't want duplicates due to the requirements.
* If we sort the array, then all the duplicates will be by each other.
* By organizing, we know where each duplicate would be, and what would happen.

Once our array is sorted, we can then start Traversing our array in different ways.
We have multiple Pointers, with steps below explaining each one.

Pointer 1:
* This is a fixed pointer
    * Fixed to an extent that its fixed while two other pointers move.
    * It will eventually be unfixed once those other two pointers reach specific conditions (see below).
* This pointer will go to array length - 2 (we subtract two so our other pointers can consider pointing at the remaining values)
* Main Conditional:
    * If nums[i] == nums[i-1], basically is the value we're at equal to the one previously, we go to the next value.
    * This basically checks to see if we're at a duplicate value.

Pointer 2 & 3:
* These two pointers will work together.
* Pointer 2 starts at i + 1, it starts right after the first value we're comparing
* Pointer 3 starts at array.length - 1, it starts at the end of the array.

We are going to loop while Pointer 2 < Pointer 3, basically they are valid pionters.
* We are going to create a sum value, which is each value at each pointer index added together.
    * If our sum is 0
        * We are going to add all the values at each pointer to our final list
        * We then have to update each pointer specifically.
            * Pointer 2: While Pointer 2 is less than Pointer 3 and the value after Pointer 2 is a duplicate, increment it
                * This ensure we don't use duplicate values, and we are still less than Pointer 3.
            * Pointer 3: While Pointer 3 is greater than Pointer 2 and the value before Pointer 3 is a duplicate, decrement it.
                * Ensures no duplicates once again
    * If our sum is < 0
        * This means we are too negative, we would want to basically have a smaller negative value.
        * Thus, increment Pointer 2
            * Since Pointer 2 is on the negative values (remember sorted array)
    * If our sum is > 0
        * This means we are too positive, we would want smaller positive values.
        * Thus, decrement Pointer 3.

What I originally thought
* I first thought that, oh we would want more negative values or more positive values when our sum is <0 or >0.
    * But our pointers already point to the lowest/highest possible value. Therefore, we know we have to go to the value after/before since we can't get any more lower/higher.



## Time Complexity:
1. Time: O(n<sup>2</sup>)

2. Space: O(n)


## Examples: See Solution.java for examples