# Solution Information
## Coding Pattern Used:
**Two-Pointer** Method is used throughout this problem.


## What Did the Pattern Do:
The pattern allowed us to check individual characters in our ***haystack*** and ***needle***.
* It was used to compare characters against one another.
    * If comparison was met, incremented both pointers.
    * If comparison wasn't met, then we'd remove that index in our Data Structure and continue checking other idexes.



## The idea:
How I solved this was I thought about a couple of things:
1. Could I just walk both words, using two pointers, and compare?
    * Concern is, how do I keep track of the original index.
    * How do I handle if the edge case, 2nd character in ***haystack*** doesn't match second character in ***needle*** but it matches the first letter.
2. How do I handle restarting the pointers if ***needle*** pointer walks off, but ***haystack*** isn't done?
    * I would restart ***needle*** pointer, but then where should ***haystack*** pointer start?

The Solution to these problems is as stated:
1. Use a Data Structure to keep track of where each first character in both ***needle*** and ***haystack*** match
    * Stack? ❌
        * A stack does NOT keep track of the order chronologically they are found. It would go in reverse order. So, NO
    * Queue? ✅
        * A queue maintains the order in which each index as found.
2. Walk the pointers down each word. As soon as the characters mismatch, set ***haystack*** pointer to the next value in the Queue
    * If the characters at index i, in both ***haystack*** and ***needle*** do not match, then I need to remove() the first element in the queue and set ***haystack*** pointer to the following matching index. **This would be the following element in the Queue**
    * We would then reset ***needle*** pointer back to 0, to allow for checking other substrings in ***haystack*** that might match ***needle***
3. What happens if ***needle*** pointer walks off but ***haystack*** hasn't? And vice-versa
    * This is an **edge case** 🤯
        * See edge case example below for an example.
        * But, the idea is, we should return an invalid case!!!
            * This means that while ***haystack*** may have more words to check, ***needle*** is already completed.
                * This means we have found our index for needle and therefore can end. ✅
        * Alternatively...
            * If ***haystack*** walked off, but ***needle*** still has words to check
                * This woulld mean that ***haystack*** length is less than ***needle*** and therefore in the beginning of our program, we can just end early. Its impossible to find an index in a word that is less than the word we are looking for.

## Time Complexity:
1. Time: O(m * k)
    * m checks every character in haystack. We are building our queue
    * For each value in the queue, starting at an index in haystack...
        * We compare this to the full length of needle each time.
        * Meaning for each index, we start over at 0 at the length of needle.
        * Therefore we are multiplicative since we are starting over each time against each new index of haystack.

2. Space: O(m)
    * A queue is used to store all the indices of haystack.
    * Therefore, worst case is we have to store every index of haystack, which would be of length m.


## Examples: See Solution.java for examples