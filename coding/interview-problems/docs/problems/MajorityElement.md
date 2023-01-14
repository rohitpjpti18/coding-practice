# Majority Element | [Leetcode](https://leetcode.com/problems/majority-element/)


&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an array <code>nums</code> of size <code>n</code>, return the majority element.

The majority element is the element that appears more than <code>⌊n / 2⌋</code> times. You may assume that the majority element always exists in the array.

**Example 1**

```
Input: nums = [3,2,3]
Output: 3
```
**Example 2**

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```


**Constraints:**

- <code>n == nums.length</code>
- <code>1 <= n <= 5 * 10<sup>4</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>

## JAVA

**To be implemented**

## PYTHON

```python
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count, maxElem = 0, nums[0]

        for i in nums:
            if count == 0:
                maxElem = i
                count += 1
                continue

            if maxElem == i:
                count += 1
            else:
                count -= 1

        return maxElem       
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)
