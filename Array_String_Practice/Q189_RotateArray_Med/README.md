# Solution Information
## Coding Pattern Used:
This problem was solved two different ways...
Solution 1:
* This solution handles just allocating another array.
* This then loops through nums, using the idea of modular divison, and then allocates each individual element in nums, to its rightful spot in the new array.
* We then copy the new array into nums, and then nums is allocated.

❌ Problem with Solution 1: ❌
* This requires O(n) runtime and O(n) space-complexity
    * We are allocating an entirely new array, as worse-case we have to run through the entire new array thus O(n) runtime.
    * Additionally, if we have to use every piece of memory in this array, we are doing O(n) space complexity because we are checking every single spot in this array.

Solution 2:
* This solution handles reversing the array, WITHOUT allocating a new array.
* This method comes from the idea of reversing arrays, and being able to reverse a reverse to return BACK to the original.

❌ Problems with Solution 2: ❌
* More complex to understand.
* However, I will explain more below.

✅ Positives with Solution 2: ✅
* Is the most efficient in runtime O(n)
* Is the most efficient in space complexity O(1)
    * We are NOT allocating an adiitional array, and thus doing all the work in-place.

## What Did the Pattern Do:
For this problem, we are using the idea of Two-Pointers with our reverse solution.
1. Pointer 1: Starts at beginning of array, and works its way to the right.
2. Pointer 2: Starts at end of the array, and works its way to the left.

If the array is an even number...
* The pointers will cross paths, and therefore terminate the loop
If the array is an odd number...
* The pointers will meet in the middle, and then terminate as one isn't less than the other



## The idea & Examples
Solution 1:
* The idea behind solution 1 is to basically copy the array contents of nums, into their correct position into a new array.
* Simple, is an optimal solution in regards to runtime, but is not for space complexity.

Solution 2:
* The idea behind this is a bit more complex, so we shall go with it mathematically, and then with an example.

**<br>Mathematically:</br>**
Say we have A, which represents every element that isn't k. Its thus, n - k.
Say we have B, which represents the last k elements.

We have both of these defined becuase if we want to move the array contents 3 times, we know that the last 3 elements, then more to the beginning.
* Therefore, we would separate them. First elements up to last 3 are A
* Last elements, that go to the beginning, will be B.

Let [A | B] be the array.
Then, if we reverse the entire array, we would get...
[B<sup>^</sub> | A <sub>^</sub>].
Where B<sup>^</sub> and A <sub>^</sub> are all the elements in reverse order.

Then, if we reverse each section, A <sub>^</sub> and B<sup>^</sub> individually...
[B | A] is thus returned to us.

Therefore, we can come to the conclusion, that this new array [B | A] has the elements that needed to be brought to the beginning, the last 3, B, to the front. And moved the front elements, A, to the end.

<bold>Example:</bold>
Say we have an array, [1, 2, 3, 4, 7, 8, 9].
Therefore, the length of the array = 7;
Let our k = 12.

Then, we can realize that if k > array.length, then we can use modular division to handle the remaining value.

As, if we think about it, if value 1, rotates 12 times, after the first 7 rotations, it will end up back where it started. Thus, the only rotations that matter are 12 - 7 = 5.

Therefore, the formular for k is...
k = k % array.length
k = 12 % 7 = 5.

Then, with our variables:
nums = [1, 2, 3, 4, 7, 8, 9].
k = 5
n = array length = 7.

Lets define our [A | B]
We know that A is going to be the first elements that are not k
Meaning, A = 0 -> n - k (elements in the range from 0 to n - k)
Therefore, A = [1, 2]

Then, we know that B = n - k -> n.
Therefore, B = [3, 4, 7, 8, 9]

now that we have our values computed, lets walk through the process of reversing.
Our steps are:
1. Reverse the entire array.
2. Reverse each section individually.
    * Reverse A (k -> n)
    * Reverse B(0 -> n-k)

1. Reverse the Entire Array:
[A | B] = [1, 2, 3, 4, 7, 8, 9]
[B<sup>^</sub> | A <sub>^</sub>] = [9, 8, 7, 4, 3, 2, 1]
* Notice that our array is in reverse order.
* However, if we notice each section separately, how could we undo the reversal?
    * If we reverse each section separately, we would get back to the original 

2. Reverse A
[B<sup>^</sub> | A ] = [9, 8, 7, 4, 3, 1, 2]

3. Reverse B
[B | A ] = [3, 4, 7, 8, 9, 1, 2]

🤯 TADA 🤯

Conclusion:
* By reversing the entire array, we are able to put the elements that need to be moved to the front, to the front. However, they are in reverse order.
* By reversing each specific section, A and B, we are able to return them to their original format, and therefore efficiently reverse an array k times.
