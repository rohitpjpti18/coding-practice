# Subarray with given XOR | [InterviewBit](https://www.interviewbit.com/problems/subarray-with-given-xor/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an array of integers `nums` and an integer `x`.

Find the total number of subarrays having bitwise XOR of all elements equals to `x`.

**Example 1**

```
Input: nums = [4,2,2,6,4], x = 6
Output: 4
Explaination: The subarrays having XOR of their elements as 6 are: [4,2], [4,2,2,6,4], [2,2,6], [6]
```
**Example 2**

```
Input: nums = [5,6,7,8,9], x = 5
Output: 2
Explaination: The subarrays having XOR of their elements as 5 are [5] and [5,6,7,8,9]
```

**Constraints:**

- <code>1 <= nums.length <= 10<sup>5</sup></code>
- <code>1 <= nums, x <= 10<sup>9</sup></code>

## PYTHON

```python
class Solution:
    def subarraysXor(nums, x):
        hashMap = dict()
        result, currentXor = 0, 0

        for i in nums:
            currentXor = currentXor ^ i
            diffXor = currentXor^x
            result += hashMap.get(diffXor, 0)
            if currentXor == x:
                result += 1
            hashMap[currentXor] = hashMap.get(currentXor, 0) + 1
        
        return result
```

&larr; [Back to Interview Preparation](../../InterviewPreparation.md)