# Solution Information
## Coding Pattern Used:
Coding Pattern used is Two-Pointers:
1. Pointer 1: Is used to start at beginning of the array 0th index
2. Pointer 2: Is used to start at the right-most index of Pointer 1, so 1st index (if it exists);


## What Did the Pattern Do:
The purpose of this pattern was to handle a search case of O(n), instead of O(n <sup>2</sub>)
* Pointer 1: Represents the day we should buy our stock.
* Pointer 2: Represents the day we should see our stock.



## The idea:
We know that if the day we buy and the day we sell if...
* Sell - Buy < 0, then we know we shouldn't buy and sell on that day.
    * Therefore, we know we should increment our buy day, lets buy on a different day (Pointer 1++).
We also knwo that if we buy and sell on the same day...    
* We get 0 profit 
    * Therefore we should increment our sell day (Pointer 2++).

Lastly, if our buy and sell isn't negative, and we aren't buying and selling on the same day...
* We should set our profits to be...
    * sell - buy = profits
* We will also increment our sell day, to see if selling on a different day is better
    * However, on each sell day, we are going to recompare our sell - buy, potentially dealing with similar base cases (see above two cases)

## Challenges we Faced:
For this problem specificially, we faced several challenges.
1. Challenge was figuring out how to use our Two-Pointer method
    * Most commonly, we would use Two-Pointers at opposite ends of our array
    * However, in this case, this fails when working with an example [2,1,4].
        * In this case, we never get to check buy = 1st index, sell = 2nd index.
    * Therefore, we realized can't use a method like we did in Q27 or Q88, new algorithm had to be used.

2. There are similar ways to do this problem using two loops
    * However, this would achieve a RunTime of O(n <sup>2</sup>) which isn't the optimized solution


## Examples: See Solution.java for examples