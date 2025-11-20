# Solution Information
## Coding Pattern Used:
The Coding Pattern that was used is a HashMap
* HashMaps provide O(1) look-up, but do provide O(n) space-complexity
* HashMaps, in our case, is organized in the form of a Hash.
    * In our case, each key is mapped to a hash, so when its looked up, it is looked-up based on its hash value and therefore produces our O(1) look-up.


## What Did the Pattern Do:
The pattern, in our case, provides a fast and easy look-up to see if the item was already seen in our array.
If the item was already seen, then we get that same value, and increment its count (finding the majority element)
If the item isn't seen in our map, we can add the value, with default of 1 (value) and then continue searching our array.



## The idea:
Overall idea is to provide a fast-easy look-up while achieving an O(1) look-up time.

## Time Complexity:
1. Time: O(n)
    * We loop through the array once worse-case scenario.

2. Space: O(n)
    * In the worst case, the HashMap contains every element in the array.


## Examples: See Solution.java for examples