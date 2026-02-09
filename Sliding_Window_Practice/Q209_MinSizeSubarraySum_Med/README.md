# Solution Information
## Coding Pattern Used:
The pattern used here is **Sliding Window Pattern** which kind of also has a combination of **Two Pointer Pattern**


## What Did the Pattern Do:
The pattern of sliding window uses a combination of Two Pointer.

The idea is that you have a window, and in that window, those values meet a specific condition.
* In our case, the values in our window, add up to a specific target.
* The size of the window, is therefore the number of values it takes to reach our target.



## The idea:
What is the overall things we saw first...
* Our array is unsorted!
* We know that we must find the minimum size, therefore even if we find an exact match to our target, we have to keep looking
    * There might be another minimum.

What did we do?
Initial Variables
* We established both our Pointers 1 & 2 to start at 0
    * We did this because lets say the first item is our target, well nothing is getting smaller than 1 item. DUH!
* We established a total and a variable to hold our minimum size.

Iteration
* We clearly are going to have Pointer 2 lead, so we can only iterate till Pointer 2 is at its wits end (end of the array)
    * The best way to do this is to add to our total on whatever value Pointer 2 is on, and then we will eventually increment it to the next value.

* Before we can just increment Pointer 2, we have a conditional we need to check...
    * What if the value we just added, thanks to Pointer 2, is our total, or its above it?
        * Then we know we can set subsize to be that value.
           * Which is going to be Pointer 2 - Pointer 1 + 1
               * The +1 is included because if Pointer 2 = 3, Pointer 1 =0, we actually have 4 values here. NOT 3, so we need the + 1 for the length!

        * Then we are going to substract from our total
            * We subtract whatever value Pointer 1 points at
        * We then increment Pointer 1, as we basically removed a value from our total value count.
* Now, we can increment 2 as our iteration is going to run until total < target.
    * We know this will be true as for this loop to run, we obviously had to reach a value that put it on target, and therefore by subtracting those values, we are instantly going to get below target.

Returning
* We are wanting to return oru subSize
    * The size we found when we were total >= target.


## Time Complexity:
1. Time: O(n)
    * While you may look at this, and see two loops inside each other and instantly think that's O(n<sup>2</sub>).
        * Don't worry, I did too at first 🤓
    * Think about what the loops are doing:
        * OuterLoop:
            * Loops until Pointer 2 > nums.length = O(n)

        * Innterloop:
            * Loops until total < target.
                * This only increments pt1 though. We aren't actually re-searching the entire array.
                * Therefore, the worst case is Pointer 1 = Pointer 2 which is a max of O(n)

    * Thus, our total time complexity is O(n) + O(n) = O(n) 

2. Space: O(1)
    * We only used primitive types


## Examples: See Solution.java for examples