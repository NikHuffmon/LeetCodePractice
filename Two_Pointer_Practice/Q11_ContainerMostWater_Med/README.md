# Solution Information
## Coding Pattern Used:
The pattern used in this problem is **Two Pointer Pattern**


## What Did the Pattern Do:
The pattern allowed us to walk the array in opposite directions, allowing us to reach an optimal solution.
1. Pointer 1 started at index 0, and increasingly moved to the right.
2. Pointer 2 started at index length - 1 and was decremented until pointer 2 was less than pointer 1.



## The idea:
The idea in this problem is strictly with how the container area was calculated.
* We know that our container is going to be a rectangle.
    * Therefore, the area is calculatd length * width.
        * Length: Calculated by taking the minimum height at each pointer index in the array.
        * Width: Calculated by taking the difference between the pointers numeric value.

## Challenge I faced:
I thought this was similar to Two-Sum in the idea that you can't use Two-Pointers in case there is a middle high number that will help us reach a maximum target.

But...
* This isn't the case.
* The area will regard on the smallest possible height, therefore, even if we have a minimum value in the beginning, it won't affect the overall area.
    * If there is a smaller area in the middle, for it to truly make a different like Two-Sum, there would have to be all smaller areas throughout the container.
    * If there is one smaller in the middle, or one larger in the middle, and none other of the same, it would proceed as normal.
        * If its 1 2 9 2 1.
            * Note that the larger in the middle doesn't dictate anything because its restricted by the smaller values due to the way an area is computed.
        * If its 9 8 2 9 8
            * Note that the smaller area is overpowered by the other larger values. There area is just bigger
        * If its 1 2 1
            * Once again, the more smaller values over powers it.
        * If its 9 1 9 
            * Simiarly, larger numbers create a rectangle and therefore overpower the one smaller vlaue.


![alt text](image.png)


## Time Complexity:
1. Time: O(n)
    * The worst case scenario is that we have to loop the entire array.

2. Space: O(1)
    * We are only using primitive types


## Examples: See Solution.java for examples